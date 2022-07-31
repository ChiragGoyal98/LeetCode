class NumArray {
    int arr[], sum;
    public NumArray(int[] nums) {
        arr = nums;
        for(int n:nums)
            sum+=n;
    }
    
    public void update(int index, int val) {
        sum = sum - arr[index] + val;
        arr[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int ans = sum;
        for(int i=0; i<left; i++)
            ans -= arr[i];
        for(int i = arr.length-1; i>right; i--)
            ans -= arr[i];
        return ans;
    }
    // public void prefixSum(int idx){
    //      sum[0] = arr[0];
    //      if(idx==0)
    //          idx++;
    //      for(int i = idx; i<arr.length; i++)
    //      {
    //          sum[i] = sum[i-1] + arr[i];
    //      }
    //      // for(int i=0; i<arr.length; i++)
    //      //     System.out.print(sum[i]+" ");
    //      // System.out.println();
    //  }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */