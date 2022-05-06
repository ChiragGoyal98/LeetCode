class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        if(size%2==0)
            return nums[size/2-1];
        else
            return nums[size/2];
    }
}