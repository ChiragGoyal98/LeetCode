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
    TreeNode ans = null;
    int depth = -1;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        helper(root,0);
        return ans;
    }
    
    public int helper(TreeNode root, int d)
    {
        if(root == null)
            return -1;
        
        //leaf check
        if(root.left == null && root.right == null)
        {
            if(d>depth)
            {
                depth = d;
                ans = root;
            }
            return d;
        }
        
        int left = helper(root.left, d+1);
        int right = helper(root.right, d+1);
        
        if(left == right && right == depth){
            ans = root;
            return left;
        }
        return Math.max(left, right);
    }
}