class Solution {
    
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int ele : nums)
        {
            sum += ele;
            max = sum>max ? sum : max;
            sum = sum<0 ? 0 : sum;
        }
        return max;
    }
}