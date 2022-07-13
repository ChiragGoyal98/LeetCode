class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0)
            return 0;
        if(n==2 || n==1)
            return 1;
        int max = 0;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        max = 1;
        for(int i=1; (2*i+1)<=n; i++)
        {
            dp[i*2] = dp[i];
            max = Math.max(max, dp[i*2]);
            dp[(i*2) + 1] = dp[i] + dp[i+1];
            max = Math.max(max, dp[(i*2)+1]);
        }
        return max;
    }
}