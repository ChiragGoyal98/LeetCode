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
    public static int min(TreeNode node) {
    // write your code here
        TreeNode temp = node;
        while(temp.left!=null)
            temp = temp.left;
        return temp.val;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return root;
        
        // if(root.val == key)
        // {
        //     if(root.left == null)
        //         return root.right;
        //     if(root.right == null)
        //         return root.left;
        //     return treeBuilder(root.left, root.right);
        // }
        
        if(key < root.val){
            root.left = deleteNode(root.left,key);
        }
        else if( key > root.val){
            root.right = deleteNode(root.right,key);
        }
        else{
            //both child null
            if(root.left == null && root.right == null)
                return null;
            //one child null
            if((root.left != null && root.right == null) || (root.left == null && root.right != null))
                return root.left !=null ? root.left : root.right;
            
            //no child null
            int minElement = min(root.right);
            root.val = minElement;
            root.right = deleteNode(root.right, minElement);
        }
        return root;
    }
}