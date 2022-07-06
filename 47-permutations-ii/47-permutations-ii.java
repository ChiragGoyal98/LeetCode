class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ans, new ArrayList<>(), nums, new boolean[nums.length]);
        return ans;
    }
    
    public void backtrack(List<List<Integer>> ans, List<Integer> tempList, int[] nums, boolean []used)
    {
        if(tempList.size()==nums.length)
        {
            ans.add(new ArrayList(tempList));
            return;
        }
        for(int i=0; i<nums.length; i++)
        {
            if(used[i] || i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(ans, tempList, nums, used);
            used[i] = false;
            tempList.remove(tempList.size()-1);
            
        }
    }
}