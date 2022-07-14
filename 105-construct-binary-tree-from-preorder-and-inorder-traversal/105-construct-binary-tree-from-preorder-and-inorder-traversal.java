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
    //static int preIndex = 0;
//     public TreeNode buildTree(int[] preorder, int[] inorder) {
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         for(int i=0; i<inorder.length; i++)
//             hm.put(inorder[i],i);
//         return construct(preorder, hm, 0, 0, inorder.length-1);
//     }
//     public TreeNode construct(int []preorder, Map<Integer, Integer> hm, int pidx, int inStart, int inEnd)
//     {
//         int a = preorder[pidx], imid = hm.get(a);
//         TreeNode root = new TreeNode(a);
//         if(imid >inStart)
//             root.left = construct(preorder, hm, pidx+1, inStart, imid-1);
//         if(imid >inEnd)
//             root.left = construct(preorder, hm, pidx + imid - inStart +1 , imid+1, inEnd);
        
//         return root;
//     }
    public TreeNode buildTree(int[] P, int[] I) {
        Map<Integer, Integer> M = new HashMap<>();
        for (int i = 0; i < I.length; i++)
            M.put(I[i], i);
        return splitTree(P, M, 0, 0, I.length-1);
    }
    
    private TreeNode splitTree(int[] P, Map<Integer, Integer> M, int pix, int ileft, int iright) {
        int rval = P[pix], imid = M.get(rval);
        TreeNode root = new TreeNode(rval);            
        if (imid > ileft)
            root.left = splitTree(P, M, pix+1, ileft, imid-1);
        if (imid < iright)
            root.right = splitTree(P, M, pix+imid-ileft+1, imid+1, iright);
        return root;
    }
}