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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        
        return helper(nums, 0, nums.length-1);
    }
    
    public TreeNode helper(int nums[], int l, int h){
        if(l>h)
            return null;
        
        int m = (l+h)/2;
        
        TreeNode head = new TreeNode(nums[m]);
        head.left = helper(nums, l, m-1);
        head.right = helper(nums, m+1, h);
        return head;
    }
}