class Solution {
    public int addDigits(int num) {
        while(true)
        {
            int t=num;
            num=0;
            while(t>0)
            {
                int rem = t%10;
                t=t/10;
                num+=rem;
            }
            if(num<10)
                return num;
        }
    }
}