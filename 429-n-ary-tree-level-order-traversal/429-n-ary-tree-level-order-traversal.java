/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        
        while(qu.size()!=0)
        {
            int qLen = qu.size();
            List<Integer> row = new ArrayList<>();
            for(int i=0; i<qLen; i++)
            {
                Node curr = qu.poll();
                row.add(curr.val);
                for(int j=0; j<curr.children.size(); j++){
                    if (curr.children.get(j) != null) qu.add(curr.children.get(j));
                }    
                
            }
            ans.add(row);
        }
        
        return ans;
    }
}