class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int res[] = new int[nums.length];
        int i=0;
        for(i=0; i<nums.length; i++)
        {
            if(i==0)
            {
                res[index[i]] = nums[i]; 
            }
            else
            {
                shiftRight(res,index[i], i);
                res[index[i]] = nums[i];
            }
        }
        return res;
    }
    public void shiftRight(int arr[], int si, int ei)
    {
        for(int i=ei; i>si; i--)
        {
            arr[i] = arr[i-1];
        }
    }
}