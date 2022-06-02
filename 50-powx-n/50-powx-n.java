class Solution {
    public double myPow(double x, int n) {
        // double ans = 1;
        // if(n>0)
        // {
        //     for(int i=0; i<n; i++)
        //     {
        //         ans *= x;
        //     }
        // }
        // else if(n<0)
        // {
        //     n*=-1;
        //     for(int i=0; i<n; i++)
        //     {
        //         ans *= (1/x);
        //     }
        // }
        // return ans;
        
        double temp = x;
        
        if(n==0)
            return 1;
        
        temp = myPow(x,n/2);
        
        if(n%2==0)
            return temp*temp;
        else
        {
            if(n>0)
                return x*temp*temp;
            else
                return (1/x)*temp*temp;
        }
    }
}