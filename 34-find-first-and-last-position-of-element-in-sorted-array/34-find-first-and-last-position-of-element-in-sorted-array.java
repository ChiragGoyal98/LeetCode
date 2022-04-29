class Solution {
    public int[] searchRange(int[] nums, int target) {
        int li=-1, fi=-1;
        int s=0, e=nums.length-1;
        
        while(s<=e)
        {
            int m = s+ (e-s)/2;
            if(nums[m]==target)
            {
                fi=m;
                e=m-1;
            }
            else if(nums[m]<target)
                s=m+1;
            else
                e=m-1;
        }
        s=0;
        e=nums.length-1;
        while(s<=e)
        {
            int m = s+ (e-s)/2;
            if(nums[m]==target)
            {
                li=m;
                s=m+1;
            }
            else if(nums[m]<target)
                s=m+1;
            else
                e=m-1;
        }
        int ans[] = new int[2];
        ans[0]= fi;
        ans[1]= li;
        return ans;
    }
}