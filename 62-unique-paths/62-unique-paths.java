class Solution {
    public int uniquePaths(int m, int n) {
        // return helper(0, 0, m-1, n-1);
        if(m == 1 || n == 1)
            return 1;
        m--;
        n--;
        if(m < n) {             
            int t = m;
            m = n;
            n = t;
        }
        long res = 1;
        int j = 1;
        for(int i = m+1; i <= m+n; i++, j++){
            res *= i;
            res /= j;
        }
            
        return (int)res;
    }
    
//     public int helper(int i, int j, int m, int n){
//         if(i==m && j==n)
//             return 1;
        
//         int a=0, b=0;
        
//         if(i+1<=m)
//             a = helper(i+1, j, m, n);
        
//         if(j+1<=n)
//             b = helper(i, j+1, m, n);
//         return a+b;
//     }
}