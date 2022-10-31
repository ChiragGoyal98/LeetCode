class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        if(check(matrix, 0, 0, r, c) == false)
            return false;
        //first row
        for(int m=1; m<r; m++)
        {
            if(check(matrix, m, 0, r, c) == false)
                return false;
        }
        //first row
        for(int n=1; n<c; n++)
        {
            if(check(matrix, 0, n, r, c) == false)
                return false;
        }
        return true;
        
    }
    public boolean check(int [][] matrix, int i, int j, int r, int c)
    {
        int val = matrix[i][j];
        for(int m=i+1, n=j+1; m<r && n<c; m++, n++)
        {
            if(matrix[m][n] != val)
                return false;
        }
        return true;
    }
}