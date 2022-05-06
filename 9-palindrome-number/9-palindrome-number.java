class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int rev=0, t=x;
        while(t>0)
        {
            rev = rev*10 + t%10;
            t=t/10;
        }
        if(rev==x)
            return true;
        return false;
    }
}