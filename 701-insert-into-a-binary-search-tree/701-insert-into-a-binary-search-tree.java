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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        {
            TreeNode node = new TreeNode(val);
            return node;
        }
        if(root.val>val)
        {
            root.left = insertIntoBST(root.left,val);
            return root;
        }
        else{
            root.right = insertIntoBST(root.right,val);
            return root;
        }
        // if(root.val>val)
        // {
        //     if(root.left==null)
        //     {
        //         root.left = insertIntoBST(root.left,val);
        //         return root;
        //     }
        //     else
        //         return insertIntoBST(root.left,val);
        // }
        // else{
        //      if(root.right==null)
        //     {
        //         root.right = insertIntoBST(root.right,val);
        //         return root.right;
        //     }
        //     else
        //         return insertIntoBST(root.right,val);
        // }
            
    }
}