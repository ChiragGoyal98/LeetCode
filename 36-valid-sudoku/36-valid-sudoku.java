class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(!isValid(board, i, j, board[i][j]))
                        return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board, int r, int c, char target){
        
        for(int i=0; i<9; i++){
            if(i!=c && board[r][i] == target)
                return false;
        }
        
        for(int i=0; i<9; i++){
            if(i!=r && board[i][c] == target)
                return false;
        }
        
        int x = r - r%3, y = c-c%3;
        for(int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
                if(board[i][j]==target && !(i==r && j==c))
                    return false;
            }
        } 
        return true;
        
    }
}