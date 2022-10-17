class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(char ch: sentence.toCharArray())
            set.add(ch);
        
        return set.size()==26;
        
        /*boolean freq[] = new boolean[26];
        int len = sentence.length();
        for(int i=0; i<len; i++)
        {
             freq[sentence.charAt(i)-'a'] = true;
        }
        for(int i=0; i<26; i++)
        {
            if(freq[i] == false)
                return false;
        }
        return true;*/
    }
}