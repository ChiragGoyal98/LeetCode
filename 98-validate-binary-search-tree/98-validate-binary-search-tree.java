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
    public class pair{
        boolean isBST;
        long max;
        long min;
        pair(){}
        
        pair(boolean isBST, long max, long min){
            this.isBST = isBST;
            this.min = min;
            this.max = max;
        }
    }
    
    public pair helper(TreeNode root){
        if(root == null)
        {
            pair basePair = new pair(true, Long.MIN_VALUE, Long.MAX_VALUE);
            return basePair;
        }
        
        pair leftAns = helper(root.left);
        pair rightAns = helper(root.right);
        
        pair finalAns = new pair();
        
        finalAns.isBST = leftAns.isBST && rightAns.isBST && leftAns.max < root.val && rightAns.min > root.val;
        
        finalAns.max = Math.max(root.val, rightAns.max);
        finalAns.min = Math.min(root.val, leftAns.min);
        return finalAns;
//         if(leftAns.isBST == false || rightAns.isBST == false)
//         {
//             finalAns.isBST = false;
//             return finalAns;
//         }
        
//         if(leftAns.max <root.val && rightAns.min >root.val)
//             finalAns.isBST = true;
//         else
//         {
//             finalAns.isBST = false;
//             return finalAns;
//         }
//         finalAns.min = leftAns.min;
//         finalAns.max = rightAns.max;
        
        
        
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root).isBST;
    }
}