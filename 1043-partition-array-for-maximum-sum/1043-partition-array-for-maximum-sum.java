class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        return helper(arr, 0, k, new int[arr.length]);
    }
    public int helper(int []arr, int start, int k, int []dp){
        if(start>=arr.length)
            return 0;
        if(dp[start]!=0)
            return dp[start];
        int max1=0, max2 = 0;
        for(int i = start; i<start+k && i<arr.length; i++)
        {
            max1 = Math.max(max1,arr[i]);
            max2 = Math.max(max2, (max1 * (i-start+1))+helper(arr, i+1, k, dp));
        }
        return dp[start] = max2;
    }
}