class Solution {
    public int pivotIndex(int[] nums) {
//         int rsum = 0;
//         for(int e : nums){
//             rsum+=e;
//         }
//         int lsum = 0, i=0, ans = -1;
//         while(i<nums.length)
//         {
            
//             rsum-=nums[i];
//             if(lsum == rsum)
//                 return i;
//             lsum+=nums[i];
//             i++;
//         }
//         return -1;
        if(nums.length<1)
            return -1;
        int rsum=0, lsum=0;
        for(int x:nums)    //calculating sum of the array
            rsum+=x;
        for(int x=0; x<nums.length; x++)
        {
            rsum-=nums[x];
            if(rsum==lsum)
                return x;
            lsum+=nums[x];
        }
        return -1;
    }
}