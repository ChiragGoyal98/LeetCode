class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int [][] matrix)
    {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void reverse(int [][]matrix)
    {
        for(int i=0; i<matrix.length; i++)
        {
            int s=0, e=matrix[i].length-1;
            while(s<e)
            {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
                s++;
                e--;
            }
        }
    }
}