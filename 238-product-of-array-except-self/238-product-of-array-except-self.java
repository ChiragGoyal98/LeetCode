class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, zeroCount=0;
        boolean flag = false;
        for(int ele: nums)
        {
            if(ele==0)
            {
                flag = true;
                zeroCount++;
                if(zeroCount>1)
                {
                    int []ans = new int[nums.length];
                    Arrays.fill(ans,0);
                    return ans;
                }
            }
            else
                product *= ele;
        }
        int []ans = new int[nums.length];
        if(flag == true)
            Arrays.fill(ans,0);
        else
            Arrays.fill(ans,product);
        // if(zeroCount>1)
        //     return ans;
        for(int i=0; i<nums.length; i++)
        {
            if(flag == true)
            {
                if(nums[i]==0)
                    ans[i] = product;
            }
            else
                ans[i] /= nums[i];
        }
        
        return ans;
    }
}