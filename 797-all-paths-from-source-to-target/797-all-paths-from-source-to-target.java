class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        dfs(graph,ans,curr, 0);
        return ans;
    }
    public void dfs(int [][]graph, List<List<Integer>> ans, List<Integer> curr, int start)
    {
        curr.add(start);
        if(start == graph.length-1)
        {
            ans.add(new ArrayList(curr));
            curr.remove(curr.size()-1);
            return;
        }
        for(int ver : graph[start])
            dfs(graph,ans,curr,ver);
        curr.remove(curr.size()-1);
    }
}