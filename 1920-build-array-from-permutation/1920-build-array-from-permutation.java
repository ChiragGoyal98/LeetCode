class Solution {
    public int[] buildArray(int[] nums) {
        int k = nums.length,i=0;
        int ans[] = new int[k];
        //for( int i = 0; i<k; i++){
        for(int val:nums)
        {
            ans[i] = nums[val];
            i++;
        }
        return ans;
    }
}