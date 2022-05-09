class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int maxSum = (size*(size+1))/2;
        
        int arrSum=0;
        for(int i=0; i<size; i++)
            arrSum+=nums[i];
        return maxSum-arrSum;
    }
}