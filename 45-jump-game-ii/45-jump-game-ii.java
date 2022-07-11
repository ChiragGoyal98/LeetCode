// class Solution {
//     public int jump(int[] nums) {
//         int []dp = new int[nums.length+1];
//         Arrays.fill(dp,-1);
//         return helper(nums, 0, dp);
//     }
//     public int helper(int []nums, int idx, int []dp){
//         if(idx>=nums.length)
//             return Integer.MAX_VALUE;
//         if(idx == nums.length-1)
//             return 0;
//         if(dp[idx]!=-1)
//             return dp[idx];
//         int min = Integer.MAX_VALUE-1;
//         for(int i=1; i<=nums[idx]; i++)
//             min = Math.min(min, helper(nums, idx+i, dp));
//         return dp[idx] = 1+min;
//     }
// }
class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,n);
        dp[n-1]=0; // to reach the last element from the last element, it will take 0 jump
        for(int i=n-2;i>=0;i--)
        {
            for(int j=1;j<=nums[i];j++)
            {
                dp[i]=Math.min(dp[i],1+dp[Math.min(n-1,j+i)]);
            }
        }
        return dp[0];
    }
}