class Solution {
    public int countBattleships(char[][] board) {
        int ans = 0;
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if(board[i][j] == 'X')
                    ans += helper(board, i, j);
            }
        }
        return ans;
    }
    
    public int helper(char[][] board, int s, int e){
        if(s>=0 && s<board.length && e>=0 && e<board[0].length && board[s][e] == 'X')
        {
            board[s][e] = '.';
            helper(board, s-1, e);
            helper(board, s, e+1);
            helper(board, s+1, e);
            helper(board, s, e-1);
            return 1;
        }
        return 0;
    }
}