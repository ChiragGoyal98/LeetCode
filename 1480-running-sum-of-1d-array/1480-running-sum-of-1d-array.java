class Solution {
    public int[] runningSum(int[] nums) {
        int rs=0, n=nums.length, ans[] = new int[n];
        
        for(int i=0; i<n; i++){
            rs+=nums[i];
            ans[i] = rs;
        }
        return ans;
    }
}