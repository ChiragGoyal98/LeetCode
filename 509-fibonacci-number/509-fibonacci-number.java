class Solution {
    public int fib(int n) {
        if(n==0 || n==1)
            return n;
        
        long ans[] = new long[n+1];
        
        ans[0] = 0;
        ans[1] = 1;
        for(int i=2; i<=n; i++){
            ans[i] = ans[i-1] + ans[i-2];
        }
        return (int)(ans[n]);
    }
}