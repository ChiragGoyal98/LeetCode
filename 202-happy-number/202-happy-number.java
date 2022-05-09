class Solution {
    public boolean isHappy(int n) {
        
        while(n>9)
        {
            int t=n;
            int k=0;
            while(t>0)
            {
                int rem=t%10;
                k+=rem*rem;
                t=t/10;
            }
            n=k;
            System.out.println(k);
        }
        if(n == 1 ||n == 7)
            return true;
        else
            return false;
    }
}