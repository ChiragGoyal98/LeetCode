class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int prefixSum[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            if(i==0)
                prefixSum[i] = nums[i];
            else
                prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        
        
        int []left = new int[nums.length];
        int sum = 0;
        
        for(int i=0; i<k; i++)
            sum+=nums[i];
        left[k-1] = sum;
        for(int i=k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            left[i] = Math.max(left[i-1],sum);
        }
        int []right = new int[nums.length];
        sum = 0;
        for(int i = nums.length-1; i>=nums.length-k; i--){
            sum+=nums[i];
        }
        right[nums.length-k] = sum;
        for(int i=nums.length - k -1; i>=0; i--){
            sum += nums[i] - nums[i+k];
            right[i] = Math.max(right[i+1], sum);
        }
        
        int maxSum = 0, spm=-1, lSum=0, rSum = 0;
        for(int i = k; i<=nums.length - 2*k; i++)
        {
            if(maxSum < left[i-1] + prefixSum[i-1+k] - prefixSum[i-1] + right[i+k]){
                maxSum = left[i-1] + prefixSum[i-1+k] - prefixSum[i-1] + right[i+k];
                spm = i;
                lSum = left[i-1];
                rSum = right[i+k];
            }
        }
        int ans[] = new int[3];
        for(int i=0; i<=spm-k; i++){
            if((prefixSum[i+k-1] - (i>0?prefixSum[i-1]:0)) == lSum){
                ans[0] = i;
                break;
            }
        }
        ans[1] = spm;
        for(int i=spm+k; i<=nums.length-k; i++){
            if((prefixSum[i+k-1] - prefixSum[i-1]) == rSum){
                ans[2] = i;
                break;
            }
        }
        return ans;
    }
}