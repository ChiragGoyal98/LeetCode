class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            int diff = target - nums[i];
            if(hm.containsKey(diff))
            {
                int ans[] = {hm.get(diff), i};
                return ans;
            }
            hm.put(nums[i], i);
        }
        return null;
    }
}