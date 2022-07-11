class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        // Arrays.sort(time);
        // int ans=0;
        // for(int i=0; i<time.length-1; i++)
        // {
        //     for(int j=i+1; j<time.length; j++)
        //     {
        //         if((time[i]+time[j])%60 == 0)
        //             ans++;
        //     }
        // }
        // return ans;
        int ans = 0;
        int t[] = new int[60];
        for(int i : time){
            ans += t[(60 - i%60)%60];
            t[i%60]++;
        }
        return ans;
    }
}