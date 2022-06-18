/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if(node==null)
            return node;
        if(node.val == p.val || node.val == q.val)
            return node;
        
        TreeNode leftLCA = lowestCommonAncestor(node.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(node.right, p, q);
        
        if(rightLCA!=null && leftLCA!=null)
            return node;
        
        return leftLCA!=null? leftLCA : rightLCA;
    }
}