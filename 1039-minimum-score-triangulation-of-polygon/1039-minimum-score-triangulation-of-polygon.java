class Solution {
    public int minScoreTriangulation(int[] values) {
        int [][]dp = new int[values.length][values.length];
        
        for(int gap = 2; gap<dp.length; gap++){
            for(int si = 0, ei = gap; ei<dp.length; si++, ei++)
            {
                if(gap==2)
                    dp[si][ei] = values[si] * values[si+1] * values[ei];
                else{
                    int min = Integer.MAX_VALUE;
                    for(int i = si+1; i<ei; i++)
                    {
                        min = Math.min(min, dp[si][i] + dp[i][ei] + values[si] * values[i] * values[ei]);
                    }
                    dp[si][ei] = min;
                }
            }
        }
        return dp[0][dp.length-1];
    }
}