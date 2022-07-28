class Solution {
    public int[] searchRange(int[] nums, int target) {
        // if(nums.length == 1 && nums[0] == target)
        //     return new int[]{0,0};
        int s = 0, e = nums.length - 1;
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        while(s<=e)
        {
            int m = (s + e) / 2;
            if(nums[m] == target)
            {
                ans[0] = findLeft(nums, m, target);
                ans[1] = findRight(nums, m, target);
                return ans;
            }
            if(nums[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }
        return ans;
    }
    
    public int findLeft(int []nums, int idx, int target)
    {
        while(idx >=1 && nums[idx] == nums[idx-1])
            idx--;
        return idx;
    }
    public int findRight(int []nums, int idx, int target)
    {
        while(idx < nums.length-1 && nums[idx] == nums[idx+1])
            idx++;
        return idx;
    }
}

/*
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
} */