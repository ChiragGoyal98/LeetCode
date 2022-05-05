class Solution {
    public int lengthOfLastWord(String s) {
        int size=s.length();
        // if(size==1)
        //     return 1;
        int count=0, i=size-1,flag=0;
        while(s.charAt(i)==' ')
        {
            i--;
        }
        while(flag==0 && i>=0)
        {
            char a = s.charAt(i);
            if(a == ' ')
                flag=1;
            else
                count++;
            i--;
        }
        return count;
    }
}