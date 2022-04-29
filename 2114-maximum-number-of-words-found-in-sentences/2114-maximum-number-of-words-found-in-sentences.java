class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length, maxWords=0;
        for(int i=0; i<n; i++){
            int s=0;
            String w = " ";
            String a[] = sentences[i].split("");
            for(int j=0; j<a.length; j++)
            {
                if(a[j].equals(w))
                    s++;
            }
            maxWords = Math.max(maxWords,s);
        }
        return maxWords+1;
    }
}