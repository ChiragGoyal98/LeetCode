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
    private List<Integer> curr = new ArrayList<>();  // To store the current path. This will be used to check the length of the path. You can use a variable in place of this.
    private int[] hm = new int[10];  // Given that 1 <= node.val <= 9, we will use this array as a frequency map.
    private int oc = 0, res = 0;  // oc for keeping odd number count, res for keeping palindromic path count. 
    
    public int pseudoPalindromicPaths (TreeNode root) {
        if(root == null){
            return 0;
        }
        helper(root);
        return res;
    }
    
    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        
        curr.add(root.val);  // add the value of current node to the list
        hm[root.val]++;  // update the frequency of that value for the current path
        
        if(root.left == null && root.right == null){  // leaf node condition
            for(int i = 0; i < 10; i++){
                if(hm[i] != 0 && hm[i] % 2 == 1){  // count the numbers which have odd frequencies in the root to leaf path
                    oc++;
                }
            }
            
            if((curr.size() % 2 == 1 && oc == 1) || (curr.size() % 2 == 0 && oc == 0)){  // the same conditions as explained above
                res++;
            }
            oc = 0;  // reset odd count to 0 as we are done with this path
        }
        
        helper(root.left);
        helper(root.right);
        
        curr.remove(curr.size() - 1);  //remove the last node's value while backtracking
        hm[root.val]--;  // reduce its frequency as we are going to find a new path now
}
}