class Solution {
    public int missingNumber(int[] nums) {
        int maxSum = (nums.length*(nums.length+1))/2;
        for(int val:nums)
            maxSum-=val;
        return maxSum;
    }
}