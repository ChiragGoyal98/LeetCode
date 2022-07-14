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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return builder(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
    public TreeNode builder(int []inorder, int inS, int inE, int []postorder, int pS, int pE)
    {
        if(inS>inE || pS>pE)
            return null;
        
        TreeNode root = new TreeNode(postorder[pE]);
        int idx = 0;
        for(idx = 0; idx < inorder.length; idx++)
        {
            if(inorder[idx] == root.val)
            {
                break;
            }
        }
        
        root.left = builder(inorder, inS, idx-1, postorder, pS, pS+idx-inS-1);
        root.right = builder(inorder, idx+1, inE, postorder, pS+idx-inS, pE-1);
        return root;
    }
}