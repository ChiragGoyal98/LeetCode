class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(x==0)
            return 0;
        double smallAns = myPow(x, n/2);
        if(n%2 == 0)
            return smallAns*smallAns;
        else{
            if(n>=0)
                return smallAns*smallAns*x;
            else
                return smallAns*smallAns*(1/x);
        }
    }
}