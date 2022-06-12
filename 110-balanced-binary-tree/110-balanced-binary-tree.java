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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        
        
        int h1 = maxDepth(root.left);
        int h2 = maxDepth(root.right);
        
        return Math.abs(h1-h2)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        
        int max = 0;
        int m = maxDepth(root.left);
        max = m>max?m:max;
        m = maxDepth(root.right);
        max = m>max?m:max;
        
        return max+1;
    }
}