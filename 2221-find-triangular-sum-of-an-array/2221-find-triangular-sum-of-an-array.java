class Solution {
    public int triangularSum(int[] nums) {
        int iter = nums.length-1;
        while(iter>0)
        {
            for(int i=0; i<iter; i++)
            {
                nums[i] = (nums[i]+nums[i+1])%10;
            }
            iter--;
        }
        return nums[0];
    }
}