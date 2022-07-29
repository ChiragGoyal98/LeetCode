class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans = new ArrayList<>();
        //HashMap<Character, Character> hm; = new HashMap<>();
        
        for(String word: words){
            if(matches(word, pattern))
                ans.add(word);
        }
        return ans;
    }
    private boolean matches(String word, String pattern){
        char [] p2w = new char[26];
        char [] w2p = new char[26];
        
        for(int idx = 0; idx<word.length(); idx++)
        {
            char wCh = word.charAt(idx);
            char pCh = pattern.charAt(idx);
            
            if(p2w[pCh-'a'] == 0)
                p2w[pCh-'a'] = wCh;
            if(w2p[wCh-'a'] == 0)
                w2p[wCh-'a'] = pCh;
            
            
            if(p2w[pCh-'a'] != wCh || w2p[wCh-'a'] != pCh)
                return false;
        }
        return true;
    }
}