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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        inorder(root1,a1);
        inorder(root2,a2);
        return mergeTwoSortedLists(a1,a2);
    }
    public void inorder(TreeNode root, List<Integer> list)
    {
        if(root==null)
            return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    
    public List<Integer> mergeTwoSortedLists(List<Integer> a1, List<Integer> a2){
        List<Integer> ans = new ArrayList<>();
        int i=0, j=0;
        
        while(i<a1.size() && j<a2.size())
        {
            if(a1.get(i)<a2.get(j))
            {
                ans.add(a1.get(i++));
            }
            else{
                ans.add(a2.get(j++));
            }
        }
        while(i<a1.size())
        {
            ans.add(a1.get(i++));
        }
        while(j<a2.size())
        {
            ans.add(a2.get(j++));
        }
        return ans;
    }
}