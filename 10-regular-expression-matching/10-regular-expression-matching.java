class Solution {
    public boolean isMatch(String s, String p) {
        boolean [][]dp = new boolean[s.length()+1][p.length()+1];

		for(int j=0; j<dp[0].length; j++)
		{
			if(j==0)	dp[0][j] = true;
			else if(p.charAt(j-1)=='*'){
				dp[0][j] = dp[0][j-2];
			}
		}
        for(int i=1; i<dp.length; i++)
		{
			for(int j=1; j<dp[0].length; j++)
			{
				char chp = p.charAt(j-1), chs = s.charAt(i-1);
				if(chp == '.')
					dp[i][j] = dp[i-1][j-1];
				else if(chp =='*')
				{
					dp[i][j] = dp[i][j-2];
					if(!dp[i][j] && (chs == p.charAt(j-2) || p.charAt(j-2) == '.'))
						dp[i][j] = dp[i-1][j];
				}
				else if(chp == chs)
					dp[i][j] = dp[i-1][j-1];
			}
		}
		
		return dp[s.length()][p.length()];
//         for(int i=1; i<dp.length; i++)
//         {
//             for(int j=1; j<dp[0].length; j++)
//             {
//                 char chp = p.charAt(j-1), chs = s.charAt(i-1);
                
//                 if(chp == '.')
//                     dp[i][j] = dp[i-1][j-1];
//                 else if(chp == '*')
//                 {
//                     dp[i][j] = dp[i][j-2];
//                     if(!dp[i][j] && ( chs == p.charAt(j-2) || p.charAt(j-2) == '.'))
//                         dp[i][j] = true;
//                 }
//                 else if(chp == chs)
//                     dp[i][j] = dp[i-1][j-1];
//             }
//         }
//         return dp[s.length()][p.length()];
    }
}