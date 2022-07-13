class Solution {
    public boolean canJump(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums, 0, dp);
    }
    public boolean helper(int []nums, int start, int []dp)
    {
        if(start>=nums.length-1)
            return true;
        if(dp[start]!=-1)
            return dp[start]==1;
        
        if(nums[start]==0)
        {
            dp[start] = 0 ;
            return false;
        }
        int jump = 1;
        while(jump<=nums[start])
        {
            if(helper(nums, start+jump, dp))
            {
                dp[start] = 1;
                return true;
            }
            jump++;
        }
        dp[start] = 0;
        return false;
    }
}