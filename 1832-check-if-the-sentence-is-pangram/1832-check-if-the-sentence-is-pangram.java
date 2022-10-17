class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean freq[] = new boolean[26];
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
        return true;
    }
}