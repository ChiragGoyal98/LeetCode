class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];
        
        
        int sr = 0, sc = 0, er = n-1, ec = n-1;
        int count = 1;
        while(count<=n*n)
        {
            int j = sc;
            while(j<=ec && count<=n*n)
            {
                matrix[sr][j] = count++;
                j++;
            }
            sr++;
            int i = sr;
            while(i<=er && count<=n*n)
            {
                matrix[i][ec] = count++;
                i++;
            }
            ec--;
            j = ec;
            while(j>=sc && count<=n*n)
            {
                matrix[er][j] = count++;
                j--;
            }
            er--;
            i = er;
            while(i>=sr && count<=n*n)
            {
                matrix[i][sc] = count++;
                i--;
            }
            sc++;
            
        }
        return matrix;
    }
}