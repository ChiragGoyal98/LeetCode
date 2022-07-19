class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(n, k, 1, 0, ans, temp);
        return ans;
    }
    
    public void dfs(int n, int k, int i, int sum, List<List<Integer>> ans, List<Integer> temp)
    {
        if(k==0)
        {
            if(sum == n)
                ans.add(new ArrayList(temp));
            return;
        }
        if(i>=10)
            return;
        if(sum>n)
            return;
        temp.add(i);
        dfs(n, k-1, i+1, sum+i, ans, temp);
        temp.remove(temp.size()-1);
        dfs(n, k, i+1, sum, ans, temp);
    }
}