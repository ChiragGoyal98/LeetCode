/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        
        int h = height(root);
        
        return helper(root, h);
    }
    
    public int height(TreeNode root){
        if(root == null)
            return 0;
        
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    
    public int helper(TreeNode root, int h)
    {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null){
            if(h == 1)
                return root.val;
            return 0;
        }
        
        return helper(root.left, h-1) + helper(root.right, h-1);
    }
}