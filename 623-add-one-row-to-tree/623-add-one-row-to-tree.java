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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1)
        {
            TreeNode newNode  = new TreeNode(val);
            newNode.left = root;
            return newNode;
        } 
        
        dfs(val, root, 1, depth);
        return root;
    }
    public void dfs(int val, TreeNode node, int n, int depth)
    {
        if(node == null)
            return;
        if(n == depth-1)
        {
            TreeNode temp = node.left;
            node.left = new TreeNode(val);
            node.left.left = temp;
            temp = node.right;
            node.right = new TreeNode(val);
            node.right.right = temp;
        }
        else{
            dfs(val, node.left, n+1, depth);
            dfs(val, node.right, n+1, depth);
        }
    }
}