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