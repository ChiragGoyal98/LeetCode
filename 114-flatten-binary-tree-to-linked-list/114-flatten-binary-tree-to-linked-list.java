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
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        
        root = helper(root);
            
        
    }
    public TreeNode helper(TreeNode root){
        if(root==null)
            return root;
        TreeNode rightChild = root.right, leftChild = root.left;
        
        root.left = null;
        TreeNode head = root;
        
        head.right = helper(leftChild);
        TreeNode temp = head;
        while(temp.right!=null)
            temp = temp.right;
        if(temp!=null)
        {
            temp.right = helper(rightChild);
        }
        else if(head.right == null){
            head.right = helper(rightChild);
        }
        return head;
    }
}