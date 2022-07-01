class Solution {
    public int numDecodings(String s) {
        int []dp = new int[s.length()+1];
        return numDecodings(s,0,dp);
    }
    public int numDecodings(String s, int idx, int []dp){
        if(idx == s.length())
            return dp[idx] = 1;
        if(dp[idx]!=0)
            return dp[idx];
        
        if(s.charAt(idx) == '0')
            return dp[idx] = 0;
        
        int count = numDecodings(s, idx+1,dp);
        if(idx < s.length()-1)
        {
            char c1 = s.charAt(idx), c2 = s.charAt(idx+1);
            int numChar = (c1-'0')*10 + (c2-'0');
            if(numChar<=26)
                count+=numDecodings(s, idx+2,dp);
        }
        return dp[idx] = count;
    }
}