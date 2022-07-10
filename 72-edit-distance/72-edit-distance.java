class Solution {
    public int minDistance(String word1, String word2) {
        int [][]dp =  new int[word1.length()+1][word2.length()+1];

        for(int i=word1.length(); i>=0; i--)
        {
            for(int j=word2.length(); j>=0; j--)
            {
                if(i==word1.length() || j == word2.length())
                    dp[i][j] = Math.abs(word1.length() - i - word2.length() + j);
                else{
                    if(word1.charAt(i)==word2.charAt(j))
                        dp[i][j] = dp[i+1][j+1];
                    else
                        dp[i][j] = 1 + Math.min(dp[i+1][j],Math.min(dp[i][j+1], dp[i+1][j+1]));
                }
            }
        }
        return dp[0][0];
        //return helper(word1,word2,0,0,new int[word1.length()][word2.length()]);
    }
    /*public static int helper(String s1, String s2, int i, int j, int [][]dp){
        if(i==s1.length() || j==s2.length()){
            return Math.abs(s1.length() - i - s2.length() + j);
        }
        if(dp[i][j]!=0)
            return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
            return dp[i][j] = helper(s1,s2,i+1,j+1,dp);
        else{
            int ans = Integer.MAX_VALUE;
            //remove
            ans = Math.min(ans,1+helper(s1,s2,i+1,j,dp));
            //replace
            ans = Math.min(ans,1+helper(s1,s2,i+1,j+1,dp));
            //insert
            ans = Math.min(ans,1+helper(s1,s2,i,j+1,dp));
            return dp[i][j] = ans;

        }
    }*/
}