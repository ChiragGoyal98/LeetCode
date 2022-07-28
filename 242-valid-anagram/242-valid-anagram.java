class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int freq[] = new int[26];
        int sum = 0;
        for(char c : s.toCharArray())
        {
            freq[c-'a'] ++;
        }
        for(char c : t.toCharArray())
        {
            freq[c-'a']--;
        }
        for(int i=0; i<26; i++)
            if(freq[i]!=0)
                return false;
        return true;
    }
}

/*
char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        for(int i=0; i<ch1.length; i++)
            if(ch1[i]!=ch2[i])
                return false;
        return true;
        */