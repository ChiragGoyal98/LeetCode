class Solution {
    // private int [][]dir = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    // long dp[][][];
    // public int findPaths(int n, int m, int maxMove, int startRow, int startColumn) {
    //     dp = new long[n][m][maxMove+1];
    //     return  (int)(dfs(n, m, maxMove, startRow,startColumn));
    // }
    // long dfs(int n, int m, int maxMove, int startRow, int startColumn)
    // {
    //     if((startRow<0 || startRow>=n || startColumn<0 || startColumn>=m ) && maxMove>=0)
    //         return 1;
    //     if(maxMove <= 0)
    //         return 0;
    //     if(dp[startRow][startColumn][maxMove]!=0)
    //         return dp[startRow][startColumn][maxMove] % (1000000007);
    //     long ans = 0;
    //     for(int i=0; i<dir.length; i++)
    //     {
    //         int x = dir[i][0], y = dir[i][1];
    //         ans += dfs(n,m, maxMove-1, startRow + x, startColumn + y);
    //     }
    //     dp[startRow][startColumn][maxMove] = ans % (1000000007);
    //     return dp[startRow][startColumn][maxMove];
    // }
    int mod = (int)1e9 + 7;
      Long[][][]memo = null;
    
     long func(int m , int n  , int maxMove , int currRow , int currColumn){


        if((currRow<0 ||  currColumn<0 || currRow>=m || currColumn>=n)  && maxMove>=0  ){
            return 1;
        }
        if(maxMove<=0) return 0;
         
        
        if(memo[currRow][currColumn][maxMove]!=null){
           return memo[currRow][currColumn][maxMove];
        }

        long sum=0;
        sum+=func(m , n, maxMove-1 , currRow-1 , currColumn);
        sum+=func(m , n, maxMove-1  , currRow , currColumn-1);
        sum+=func(m , n, maxMove-1 , currRow+1 , currColumn);
        sum+=func(m , n, maxMove-1 , currRow , currColumn+1);
      
        sum= sum %mod;
        memo[currRow][currColumn][maxMove]=sum;
        return sum;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
        memo = new Long[m+1][n+1][maxMove+1];
        return (int)func(m ,n , maxMove, startRow , startColumn);
    }
}