class Solution {
    public boolean PredictTheWinner(int[] nums) {
        if(nums.length == 1)
            return true;
        
        int sum = 0;
        for(int n: nums)
            sum += n;
        
        int p1 = optimalStrategy(nums);
        int diff = sum - p1;
        
        if(diff>p1)
            return false;
        return true;
    }
    public int optimalStrategy(int[] a){
		int [][]dp = new int[a.length][a.length];

		for(int gap = 0; gap < dp.length; gap++){
			for(int s=0, e = gap; e < dp.length; s++, e++){
				if(gap == 0)
                {
                    dp[s][e] = a[s];
                    continue;
                }
                if(gap ==1)
				{
					dp[s][e] = Math.max(a[s], a[e]);
					continue;
				}
				dp[s][e] = Math.max(a[s] + Math.min(dp[s+2][e], dp[s+1][e-1]), a[e] + Math.min(dp[s][e-2], dp[s+1][e-1]));
			}
		}
		return dp[0][dp.length-1];
 	}
}