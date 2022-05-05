class Solution {
    public int[] decompressRLElist(int[] nums) {
        int total_len = 0;
        for(int i=0; i<nums.length; i+=2)
        {
            total_len += nums[i];
        }
        int res[] = new int[total_len];
        int t=0;
        for(int i=0; i<nums.length; i+=2)
        {
            int j = nums[i];
            int k=0;
            while(k<j)
            {
                res[t] = nums[i+1];
                t++;
                k++;
            }
        }
        return res;
    }
}