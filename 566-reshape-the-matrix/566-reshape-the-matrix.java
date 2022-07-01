class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length, m = mat[0].length;
        
        if(n*m != r*c)
            return mat;
        
        int [][]ans = new int[r][c];
        int ansR = 0, ansC=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                ans[ansR][ansC++] = mat[i][j];
                
                if(ansC == c)
                {
                    ansC = 0;
                    ansR++;
                }
            }
        }
        return ans;
    }
}