class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        int []dp = new int[n];
        dp[0] = 1;
		int ans = 1;

		for(int i=1; i<arr.length; i++)
		{
			int max = 0;
			for(int j=0; j<i; j++)
			{
				if(arr[j]<arr[i]){
					max = Math.max(max,dp[j]);
				}
			}
			dp[i] = max+1;
			ans = Math.max(ans, dp[i]);
		}
		return ans;
    }
}