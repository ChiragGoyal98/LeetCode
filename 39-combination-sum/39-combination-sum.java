class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans, new ArrayList<Integer>(), candidates, target, 0);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans, List<Integer> tempList, int [] nums, int target, int start)
    {
        if(target<0)
            return;
        if(target == 0){
            ans.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=start; i<nums.length; i++)
        {
            tempList.add(nums[i]);
            backtrack(ans, tempList, nums, target-nums[i], i);
            tempList.remove(tempList.size()-1);
        }
    }
}