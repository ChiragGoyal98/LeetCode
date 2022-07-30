class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        
        int []freq = new int[26];
        // making a superword since all words in words2 should be a subset of words in word1
        for(String b: words2){
            int []currFreq = helper(b);
            for(int i=0; i<26; i++)
            {
                freq[i] = Math.max(freq[i], currFreq[i]);
            }
        }
        int i;
        for(String a: words1)
        {
            int currFreq[] = helper(a);
            
            for(i=0; i<26; i++)
            {
                if(currFreq[i]<freq[i])
                    break;
            }
            if(i==26)
                ans.add(a);
        }
        return ans;
        
        
    }
    private int[] helper(String word)
    {
        int []freq = new int[26];
        for(int i=0; i<word.length(); i++)
        {
            freq[word.charAt(i)-'a']++;
        }
        return freq;
    }
}