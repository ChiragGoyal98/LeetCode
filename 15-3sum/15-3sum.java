class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++)
        {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1]))
            {
                    int a = -nums[i];
                int s = i+1, e = n-1;

                while(s<e)
                {
                    if(nums[s]+nums[e]==a)
                    {
                        List<Integer> smallAns = new ArrayList<>();
                        smallAns.add(nums[i]);
                        smallAns.add(nums[s]);
                        smallAns.add(nums[e]);
                        ans.add(smallAns);
                        while(s<e && nums[s]==nums[s+1]) s++;
                        while(s<e && nums[e]==nums[e-1]) e--;
                        s++;
                        e--;
                    }
                    else if(nums[s]+nums[e]<a)
                        s++;
                    else
                        e--;
                }
            }
                
            // while(i+1<n && nums[i]==nums[i+1])
            //     i++;
            
        }
        return ans;
    }
}