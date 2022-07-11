class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int i, j;
        for(i=0; i<nums.length-3; i++)
        {
            for(j=i+1; j<nums.length-2; j++)
            {
                long t1 = nums[i]+nums[j];
                long t2 = target-t1;
                int x = j+1, y = nums.length-1;
                while(x<y)
                {
                    long sum = nums[x]+nums[y];
                    if(sum < t2)
                        x++;
                    else if(sum > t2)
                        y--;
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[x]);
                        temp.add(nums[y]);
                        ans.add(new ArrayList(temp));
                        while(x<y && temp.get(2) == nums[x])    x++;
                        while(x<y && temp.get(3) == nums[y])    y--;
                    }
                        
                }
                while(i<nums.length-1 && nums[i+1] == nums[i]) i++;
                while(j<nums.length-1 && nums[j+1] == nums[j]) j++;
            }
            
        }
        return ans;
    }
}