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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        
        while(qu.size()!=0)
        {
            int qLen = qu.size();
            List<Integer> row = new ArrayList<>();
            for(int i=0; i<qLen; i++)
            {
                TreeNode curr = qu.poll();
                row.add(curr.val);
                if (curr.left != null) qu.add(curr.left);
                if (curr.right != null) qu.add(curr.right);
            }
            //Collections.reverse(row);
            ans.add(row);
        }
        Collections.reverse(ans);
        return ans;
    }
}