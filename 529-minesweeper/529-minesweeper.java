class Solution {
    int [][]dir = {{-1,-1}, {-1,0}, {-1,1}, {0,1}, {1,1}, {1,0}, {1,-1}, {0,-1}};
    public char[][] updateBoard(char[][] board, int[] click) {
        int r = click[0], c = click[1];
        
        if(board[r][c] == 'M')
        {
            board[r][c] = 'X';
            return board;
        }
        
        if(board[r][c] == 'E'){
            int count = countMines(board,r,c);
            
            if(count == 0){
                board[r][c] = 'B';
                
                for(int i= 0; i<dir.length; i++)
                {
                    int x = r+dir[i][0], y = c+dir[i][1];
                    if(x < 0 || x>=board.length || y<0 || y>=board[0].length)
                        continue;
                    
                    char ch = board[x][y];
                    if(ch == 'B' || Character.isDigit(ch))
                        continue;
                    if(ch == 'X')
                        return board;
                    updateBoard(board, new int[]{x, y});
                }
            }else
                board[r][c] = (char)('0' + count);
        }
        return board;
    }
    public int countMines(char [][]board, int r, int c){
        int count = 0;
        for(int i= 0; i<dir.length; i++){
            int x = r+dir[i][0], y = c+dir[i][1];
            if(x < 0 || x>=board.length || y<0 || y>=board[0].length)
                        continue;
            char ch = board[x][y];
            // if(ch >= '1' && ch <='8')
            //     count++;
            if(ch == 'M')
                count++;
        }
        return count;
    }
}