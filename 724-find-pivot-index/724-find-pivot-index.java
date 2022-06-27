class Solution {
    public int pivotIndex(int[] nums) {
        int rsum = 0;
        for(int e : nums){
            rsum+=e;
        }
        int lsum = 0, i=0, ans = -1;
        while(i<nums.length)
        {
            
            rsum-=nums[i];
            if(lsum == rsum)
                return i;
            lsum+=nums[i];
            i++;
        }
        return -1;
    }
}