class Solution {
    public int[] getConcatenation(int[] nums) {
        int k=nums.length;
        int ans[] = new int[2*k];
        for(int i=0; i<k; i++)
        {
            ans[i] = ans[i+k] = nums[i];
        }
        return ans;
    }
}