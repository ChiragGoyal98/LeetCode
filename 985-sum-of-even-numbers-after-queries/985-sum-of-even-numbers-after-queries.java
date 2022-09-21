class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        for(int n:nums)
        {
            if(n%2==0)
                sum+=n;
        }
        int ans[] = new int[queries.length];
        for(int i=0; i<queries.length; i++)
        {
            int v = queries[i][0], idx = queries[i][1];
            if(nums[idx] % 2 == 0)
                sum -= nums[idx];
            nums[idx] += v;
            if(nums[idx] % 2 == 0)
                sum += nums[idx];
            ans[i] = sum;
        }
        return ans;
    }
}