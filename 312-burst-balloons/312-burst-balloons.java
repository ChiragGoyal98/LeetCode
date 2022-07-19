class Solution {
    public int maxCoins(int[] nums) {
        int [][]dp = new int[nums.length][nums.length];
		return helper(nums, 0, nums.length-1,dp);
    }
    
    public int helper(int []arr, int s, int e, int [][]dp)
    {
        if(dp[s][e]!=0)
            return dp[s][e];
        int max = Integer.MIN_VALUE;
        for(int i=s; i<=e; i++)
        {
            int lans = i-1 <s ? 0 : helper(arr, s, i-1, dp);
            int rans = i+1 >e ? 0 : helper(arr, i+1, e, dp);
            int myAns = (s-1>=0 ? arr[s-1] : 1) * arr[i] * (e+1 <arr.length ? arr[e+1]:1);
            max = Math.max(max, lans + rans + myAns);
        }
        return dp[s][e] = max;
    }
}