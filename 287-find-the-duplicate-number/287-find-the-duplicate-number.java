class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        while(s<nums.length-1)
        {
            if(nums[s] == nums[s+1])
                return nums[s];
            s++;
        }
        return -1;
    }
}