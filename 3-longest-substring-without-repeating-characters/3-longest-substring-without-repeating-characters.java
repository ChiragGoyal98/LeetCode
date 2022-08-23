class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0;
        for(int i=0, j=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
            while(hm.get(ch)>1)
            {
                ans = Math.max(ans, i-j);
                char chj = s.charAt(j);
                hm.put(chj, hm.get(chj)-1);
                if(hm.get(chj)==0)
                    hm.remove(chj);
                j++;
            }
        }
        ans = Math.max(ans, hm.size());
        return ans;
    }
}

/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i=0, j=0;
        int max = 0;
        while(j<s.length())
        {
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j),0)+1);
            if(hm.size() == j-i+1)
            {
                max = Math.max(max, j-i+1);
            }
            else if(hm.size()<j-i+1)
            {
                while(hm.size()<j-i+1){
                    hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
                    if(hm.get(s.charAt(i))==0)
                        hm.remove(s.charAt(i));
                    i++;
                }
            }
            j++;
        }
        return max;
    }
}
*/