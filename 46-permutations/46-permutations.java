class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums);
        return ans;
    }
    
    public void backtrack(List<List<Integer>> ans, List<Integer> tempList, int[] nums)
    {
        if(tempList.size()==nums.length)
        {
            ans.add(new ArrayList(tempList));
            return;
        }
        for(int i=0; i<nums.length; i++)
        {
           if(tempList.contains(nums[i]))
               continue;
            tempList.add(nums[i]);
            backtrack(ans,tempList, nums);
            tempList.remove(tempList.size()-1);
        }
    }
}