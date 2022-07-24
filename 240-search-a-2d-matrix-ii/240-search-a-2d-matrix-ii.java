class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c = matrix[0].length-1, r = 0;
        
        while(c>=0 && r<matrix.length){
            if(target == matrix[r][c])
                return true;
            else if(target < matrix[r][c])
                c--;
            else
                r++;
        }
        return false;
    }
}