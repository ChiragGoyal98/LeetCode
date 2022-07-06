class Solution {
    List<List<Integer>> ans;
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.ans = new ArrayList<>();
        this.nums = nums;
        // Arrays.sort(nums);
        backtrack(new ArrayList<>(), 0);
        return ans;
    }
    public void backtrack(List<Integer> tempList, int start){
        //add current subset to ans
        if(start == nums.length)
        {
            ans.add(new ArrayList<>(tempList)); //creating a copy of tempList and adding it to ans;
            return;
        }
        backtrack(tempList, start+1);
        tempList.add(nums[start]);
        backtrack(tempList, start+1);
        tempList.remove(new Integer(nums[start]));
    }
}