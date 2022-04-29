class Solution {
    public int[] buildArray(int[] nums) {
        int k = nums.length;
        int ans[] = new int[k];
        for( int i = 0; i<k; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}