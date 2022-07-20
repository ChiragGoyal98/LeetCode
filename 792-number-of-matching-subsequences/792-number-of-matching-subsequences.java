class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int ans = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for(String word: words)
        {
            if(map.getOrDefault(word,0)!=0)
            {
                if(map.get(word) == 1) //1 is a sub, -1 is not a sub
                    ans++;
                continue;
            }
            int i=0, j=0;
            while(i<word.length() && j<s.length())
            {
                if(word.charAt(i)!=s.charAt(j))
                    j++;
                else{
                    i++;
                    j++;
                }
            }
            if( i == word.length())
            {
                map.put(word,1);
                ans++;
                continue;                
            }
            map.put(word,-1);
        }
        return ans;
    }
}


/*
class Solution {
    int count = 0;
    public int numMatchingSubseq(String s, String[] words) {
        //List<String> subs = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word  , map.getOrDefault(word , 0)+1);
        }
        dfs(s, "", 0, map);
        return count;
    }
    
    public void dfs(String s, String temp, int start, HashMap<String , Integer> map){
        if(start == s.length())
        {
            // subs.add(new String(temp));
            //System.out.println(temp);
            count += map.getOrDefault(temp,0);
            map.put(temp,0);
            return;
        }
            dfs(s, temp + s.charAt(start), start+1, map);
            dfs(s, temp, start+1, map);
    }
}
*/