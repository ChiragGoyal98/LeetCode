class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int justSmaller = 0, count = 0;
        for(int n: nums)
        {
            if(n < target)
                justSmaller++;
            if(n == target)
                count++;
        }
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<count; i++){
            ans.add(justSmaller++);
        }
        return ans;
    }
}

/*
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target)
                ans.add(i);
        }
        return ans;
        */