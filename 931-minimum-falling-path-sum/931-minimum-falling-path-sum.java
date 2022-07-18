class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        for(int i=matrix.length-2; i>=0; i--)
        {
            for(int j=0; j<matrix[0].length; j++){
                int min = matrix[i+1][j];
                if(j-1>=0)
                    min = Math.min(min, matrix[i+1][j-1]);
                if(j+1<matrix[0].length)
                    min = Math.min(min, matrix[i+1][j+1]);
                matrix[i][j] +=min;
            }
        }
        
        for(int j=0; j<matrix[0].length; j++)
        {
            ans = Math.min(ans, matrix[0][j]);
        }
        return ans;
    }
}