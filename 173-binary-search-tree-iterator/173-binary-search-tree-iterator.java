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
class BSTIterator {

    private Queue<TreeNode> values = new LinkedList<>();
    private int size;
    
    public BSTIterator(TreeNode root) {
        if(root!=null)
            visit(root);
        size = values.size();
    }
    
    public int next() {
        size--;
        return values.poll().val;
    }
    
    public boolean hasNext() {
        return size>0;
    }
    private void visit(TreeNode root){
        if(root.left!=null)
            visit(root.left);
        values.add(root);
        if(root.right!=null)
            visit(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */