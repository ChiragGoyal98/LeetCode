class Solution {
    public void gameOfLife(int[][] board) {
        int [][]dir = {{-1,0}, {-1,1},
                       {0,1}, {1,1},
                       {1,0}, {1,-1},
                       {0,-1}, {-1,-1}};
        int ans[][] = new int[board.length][board[0].length];
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                int sum=0;
                for(int k=0; k<dir.length; k++)
                {
                    int x = dir[k][0], y = dir[k][1];
                    if(i+x>=0 && i+x<board.length && j+y>=0 && j+y<board[0].length)
                        sum+=board[i+x][j+y];
                }
                if(board[i][j]==0)
                {
                    if(sum==3)
                        ans[i][j] = 1;
                    else
                        ans[i][j] = 0;
                }
                else{
                    if(sum<2)
                        ans[i][j] = 0;
                    else if(sum == 2 || sum==3)
                        ans[i][j] = 1;
                    else
                        ans[i][j] = 0;
                }
            }
        }
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                board[i][j] = ans[i][j];
            }
        }
    }
}