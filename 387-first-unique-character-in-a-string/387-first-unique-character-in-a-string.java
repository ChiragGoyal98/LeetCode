class Solution {
    public int firstUniqChar(String s) {
        int charFreq[] = new int[256];
        for(int i=0; i<256; i++)
            charFreq[i]=0;
        for(int i=0; i<s.length(); i++)
        {
            charFreq[(int)(s.charAt(i))]++;
        }
        for(int i=0; i<s.length(); i++)
        {
            if(charFreq[(int)(s.charAt(i))]==1)
                return i;
        }
        return -1;
    }
}