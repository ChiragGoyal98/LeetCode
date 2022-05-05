class Solution {
    public int mySqrt(int x) {
        long i=1;
        // if(i>2147395600)
        //     return 46430;
        while(i*i<=x)
        {
            i++;
        }
        return (int) i-1;
    }
}