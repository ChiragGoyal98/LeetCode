class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuffer s2 = new StringBuffer();
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i) >='0' && s.charAt(i)<='9')
            {
                s2.append(s.charAt(i));
            }
        }
        int i=0, j = s2.length()-1;
        while(i<j)
        {
            if(s2.charAt(i) != s2.charAt(j))
                return false;
            
            i++;
            j--;
        }
        
        
        return true;
    }
}