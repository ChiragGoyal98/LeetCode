class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(n, "", ans, n, n);
        return ans;
    }
    public void dfs(int n, String curr, List<String> ans, int left, int right)
    {
        if(left>right)  return;
        
        if(left == 0 && right == 0){
            ans.add(curr);
            return;
        }
        
        if(left>0)
            dfs(n,curr+"(",ans, left-1, right);
        if(right>0)
            dfs(n,curr+")",ans, left, right-1);
    }
}