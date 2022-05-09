class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        double a = (Math.log(n)/Math.log(2));
        //System.out.print(a);
        //if((a - (int)(a)) == 0 )
        // int p = (int)(a);
        if(Math.pow(2,(int)(a)) == n)
            return true;
        return false;
    }
}