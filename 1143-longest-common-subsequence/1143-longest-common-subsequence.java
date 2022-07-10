class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        // return lcs(text1,text2,0,0,new int[text1.length()][text2.length()]);
        int [][]dp = new int[s1.length()+1][s2.length()+1];

        for(int i=s1.length(); i>=0; i--)
        {
            for(int j=s2.length(); j>=0; j--)
            {
                if(i==s1.length() || j==s2.length())
                    dp[i][j] = 0;
                else
                {
                    if(s1.charAt(i) == s2.charAt(j))
                        dp[i][j] = 1 + dp[i+1][j+1];
                    else{
                        dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                    }

                }
            }
        }
        return dp[0][0];
    }
//     public static int lcs(String s1, String s2, int i, int j, int [][]dp){
//         if(i==s1.length() || j==s2.length())
//             return 0;
//         if(dp[i][j]!=0)    return dp[i][j];
//         int ans = 0;
//         if(s1.charAt(i) == s2.charAt(j))
//             ans += 1+ lcs(s1,s2, i+1, j+1, dp);
//         else{
//             ans = Math.max(lcs(s1,s2,i+1,j,dp),lcs(s1,s2,i,j+1,dp));
//         } 
//         return dp[i][j] = ans;

//     }
}



    