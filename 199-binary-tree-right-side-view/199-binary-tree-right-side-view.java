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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
            return Collections.emptyList();
        
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);
        List<Integer> ans = new ArrayList<>();
        while(bfs.size()!=0){
            ans.add(bfs.peek().val);
            int size = bfs.size();
            for(int idx=0; idx<size; idx++)
            {
                TreeNode curr = bfs.peek();
                bfs.poll();
                if(curr.right!=null){
                    bfs.add(curr.right);
                }
                if(curr.left!=null){
                    bfs.add(curr.left);
                }
            }
        }
        return ans;
    }
}