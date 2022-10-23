class Solution {
    public int[] findErrorNums(int[] nums) {
        int freq[] = new int[nums.length];
        int ans[] = new int[2];
        for(int n: nums){
            freq[n-1]++;
            if(freq[n-1]==2)
                ans[0] = n;
        }
        for(int f=0; f<freq.length; f++)
            if(freq[f] == 0)
                ans[1] = f+1;
        
        return ans;
                
    }
}