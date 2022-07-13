class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
    
    public void backtrack(int [] nums, List<List<Integer>> ans, List<Integer> tempList, int start)
    {
        if(start==nums.length)
        {
            ans.add(new ArrayList(tempList));
            return;
        }
        tempList.add(nums[start]);
        backtrack(nums, ans, tempList, start+1);
        tempList.remove(tempList.size()-1);
        backtrack(nums, ans, tempList, start+1);
    }
}