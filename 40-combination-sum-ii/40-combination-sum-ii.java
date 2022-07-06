class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
            if(i>start && nums[i]==nums[i-1]) continue;
            tempList.add(nums[i]);
            backtrack(ans, tempList, nums, target-nums[i], i+1);
            tempList.remove(tempList.size()-1);

        }
    }
    
    
    
    
    // public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     Arrays.sort(candidates);
    //     backtrack(ans, new ArrayList<Integer>(), candidates, target, 0, new boolean[candidates.length]);
    //     return ans;
    // }
    // public void backtrack(List<List<Integer>> ans, List<Integer> tempList, int [] nums, int target, int start, boolean []used)
    // {
    //     if(target<0)
    //         return;
    //     if(target == 0){
    //         ans.add(new ArrayList<>(tempList));
    //         return;
    //     }
    //     for(int i=start; i<nums.length; i++)
    //     {
    //         if(used[i] || i>start && nums[i]==nums[i-1] && !used[i-1]) continue;
    //         used[i] = true;
    //         tempList.add(nums[i]);
    //         backtrack(ans, tempList, nums, target-nums[i], i, used);
    //         tempList.remove(tempList.size()-1);
    //         used[i] = false;
    //     }
    // }
}