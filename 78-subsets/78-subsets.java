class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans, List<Integer> tempList, int[] nums, int start){
        //add current subset to ans
        ans.add(new ArrayList<>(tempList));
        
        for(int i=start; i<nums.length; i++)
        {
            
            tempList.add(nums[i]);
            backtrack(ans, tempList, nums, i+1);
            //backtrack
            tempList.remove(tempList.size()-1);
        }
    }
}