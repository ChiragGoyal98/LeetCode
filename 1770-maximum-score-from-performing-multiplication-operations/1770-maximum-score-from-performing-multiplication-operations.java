class Solution {
    int n, m, nums[], mult[];
    Integer [][]memo;
    public int maximumScore(int[] nums, int[] multipliers) {
        n = nums.length;
        m = multipliers.length;
        this.nums = nums;
        this.mult = multipliers;
        this.memo = new Integer[m][m];
        return memoize(0,0);
    }
    private int memoize(int l, int i)
    {
        if(i==m)
            return 0;
        if(memo[l][i]!=null)
            return memo[l][i];
        int left = memoize(l+1, i+1) + nums[l]*mult[i];
        int right = memoize(l, i+1) + nums[n- (i-l) - 1]*mult[i];
        return memo[l][i] = Math.max(left, right);
    }
}