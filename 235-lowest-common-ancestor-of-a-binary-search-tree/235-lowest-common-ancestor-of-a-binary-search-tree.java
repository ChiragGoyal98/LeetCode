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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = root;
        while(lca!=null)
        {
            if(p.val < lca.val && q.val < lca.val)
            {
                //left
                lca = lca.left;
            }
            else if(p.val > lca.val && q.val > lca.val){
                //right
                lca = lca.right;
            }
            else{
                return lca;
            }
        }
        return lca;
    }
    
    
//     if(root == null)
//             return null;
//         if(p.val<q.val){
//             if(root.val == p.val)
//                 return p;
//             if(root.val>p.val && root.val<q.val)
//                 return root;
//             else if(root.val < p .val)
//             {
//                 return lowestCommonAncestor(root.right, p, q);
//             }
//             else{
//                 return lowestCommonAncestor(root.left, p, q);
//             }
//         }
//         else{
//             if(root.val == q.val)
//                 return p;
//             if(root.val>q.val && root.val<p.val)
//                 return root;
//             else if(root.val < q.val)
//             {
//                 return lowestCommonAncestor(root.right, p, q);
//             }
//             else{
//                 return lowestCommonAncestor(root.left, p, q);
//             }
//         }
}