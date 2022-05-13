class Solution {
    public boolean checkString(String s) {
        int aInd = -1, bInd=s.length();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a')
            {
                if(i>aInd)
                    aInd=i;
            }
            if(s.charAt(i)=='b' && bInd==s.length())
            {
                bInd = i;
            }
        }
        //System.out.print(aInd+ " " + bInd);
        if(aInd<bInd)
            return true;
        else
            return false;
    }
}