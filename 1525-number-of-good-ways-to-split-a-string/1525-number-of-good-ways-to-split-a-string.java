class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int pre[] = new int[n];
        int suf[] = new int[n];
        
        HashSet<Character> hs = new HashSet<>();
        
        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            hs.add(ch);
            pre[i] = hs.size();
        }
        
        hs = new HashSet<>();
        for(int i=n-1; i>=0; i--)
        {
            char ch = s.charAt(i);
            hs.add(ch);
            suf[i] = hs.size();
        }
        
        int ans = 0;
        for(int i=0; i<n-1; i++)
        {
            if(pre[i] == suf[i+1])
                ans++;
        }
        return ans;
        
        
    }
}