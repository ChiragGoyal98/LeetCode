class Solution {
    //Integer dp[][] = new Integer[1001][1001];
    
    //public int kInversePairs(int n, int k) {
        // if(n==0)
        //     return 0;
        // if(k==0)
        //   return 1;
        // if(dp[n][k] != null)
        //     return dp[n][k];
        // int inv = 0;
        // for(int i=0; i<=Math.min(k,n-1); i++)
        // {
        //     inv = (inv + kInversePairs(n-1, k-i)) % 1000000007;
        // }
        // return dp[n][k] = inv;
        int M = 1000000007;
    public int kInversePairs(int n, int k) {
    
        int [] dp = new int[k+1];
        
        for (int i = 1; i <= n; i++) {
            
            int [] prevRow = new int[k+1];
            prevRow[0] = 1;     // for k = 0, ans = 1
            for (int j = 1; j <= k; j++)  {
                
                int val = (dp[j] + M - ((j-i >= 0) ? dp[j-i] : 0)) % M;
                prevRow[j] = (prevRow[j-1] + val) % M;
            
            }
            
            dp = prevRow;
            
        }
        
        return ((dp[k] + M - (k > 0 ? dp[k-1] : 0)) % M);
    }
}