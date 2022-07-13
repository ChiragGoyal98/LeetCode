class Solution {
    public boolean divisorGame(int n) {
        // boolean []dp =new boolean[n+1];
        // for(int i=1; i<=n; i++)
        // {
        //     if(i==1)
        //         dp[i] = false;
        //     else if(i==2)
        //         dp[i] = true;
        //     else{
        //         for(int j=1; j*j <=i; j++){
        //             if(i%j == 0)
        //             {
        //                 dp[i] = !dp[i-j];
        //                 break;
        //             }
        //         }
        //     }
        // }
        // return dp[n];
        return n%2 == 0;
    }
}