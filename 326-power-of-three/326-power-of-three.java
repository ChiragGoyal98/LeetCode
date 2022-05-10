class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<=0)
        //     return false;
        // double a = Math.log(n)/Math.log(3);
        // System.out.print(a);
        // //if((a - (int)(a)) == 0 )
        // int p = (int)(a);
        // if(Math.pow(3,p) == n)
        //     return true;
        // return false;
        double a = Math.log(n) / Math.log(3);
        return Math.abs(a - Math.round(a)) < 1e-10;
    }
}