class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int x, int y) {
        
        int max = helper(nums,x,y);
        max = Math.max(max,helper(nums,y,x));
        return max;
    }
    public int helper(int[] nums, int x, int y){
        int []dp1 = new int[nums.length];
        int []dp2 = new int[nums.length];
        int csum = 0;
        for(int i=0; i<x; i++)
            csum+=nums[i];
        dp1[x-1] = csum;
        for(int i=x; i<nums.length; i++)
        {
            csum +=nums[i] - nums[i-x];
            dp1[i] = Math.max(dp1[i-1], csum);
        }
        csum = 0;
        for(int i=nums.length-1; i>=nums.length-y; i--){
            csum+=nums[i];
        }
        dp2[nums.length-y] = csum;
        for(int i=nums.length-y-1; i>=0; i--){
            csum+=nums[i]-nums[i+y];
            dp2[i] = Math.max(dp2[i+1],csum);
        }
        int max = Integer.MIN_VALUE;
        for(int i=x-1; i<nums.length-y; i++){
            if(dp1[i]+dp2[i+1]>max)
                max = dp1[i]+dp2[i+1];
        }
        return max;
    }
}