class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length, ans[] = new int[size], l = 0, h = size-1;
        int i = size-1;
        while(l<=h)
        {
            if(Math.abs(nums[l])>Math.abs(nums[h]))
            {
                ans[i] = nums[l] * nums[l];
                l++;
            }
            else{
                ans[i] = nums[h] * nums[h];
                h--;
            }
            i--;
        }
        return ans;
    }
}