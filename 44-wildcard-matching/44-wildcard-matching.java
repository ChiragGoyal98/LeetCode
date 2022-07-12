class Solution {
    public boolean isMatch(String str, String pattern) {
        boolean [][]dp = new boolean[str.length()+1][pattern.length()+1];
		for(int j=0; j<dp[0].length; j++)
		{
		    if(j==0)
		        dp[0][j] = true;
		    else if(pattern.charAt(j-1) == '*')
		        dp[0][j] = dp[0][j-1];
		}
		for(int i=1; i<dp.length; i++)
		{
			for(int j=1; j<dp[0].length; j++)
			{
				if(pattern.charAt(j-1)=='?')
					dp[i][j] = dp[i-1][j-1];
				else if(pattern.charAt(j-1)=='*')
					dp[i][j] = dp[i-1][j] || dp[i][j-1];
				else if(str.charAt(i-1)==pattern.charAt(j-1))
					dp[i][j] = dp[i-1][j-1];
			}
		}
		return dp[str.length()][pattern.length()];
    }
}