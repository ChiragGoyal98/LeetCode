class Solution {
    public boolean exist(char[][] board, String word) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                if(board[row][col] == word.charAt(0) && search(board, row, col, 0, word))
                    return true;
            }
        }
        return false;
    }
    
    public boolean search(char[][] board, int row, int col, int index, String word) {
        if(index == word.length())
            return true;
        
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index))
            return false;
        
        char current = board[row][col];
        board[row][col] = '-';
        boolean found = search(board, row + 1, col, index+1, word) ||
                        search(board, row, col + 1, index+1, word) ||
                        search(board, row - 1, col, index+1, word) ||
                        search(board, row, col - 1, index+1, word);
        
        board[row][col] = current;
        
        return found;
    }
}

/*class Solution {
    int [][]dir = {{-1,0},{0,1},{1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {
        boolean [][]visited = new boolean[board.length][board[0].length];
        for(int row=0; row<board.length; row++)
        {
            for(int col = 0; col<board[0].length; col++)
            {
                if(word.charAt(0) == board[row][col] && helper(board, word, visited, row, col))
                    return true;
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String word, boolean [][]visited, int i, int j)
    {
        if(i>=board.length || j>=board[0].length)
            return false;
        if(word.length()==0)
            return true;
        
        if(visited[i][j])
            return false;
        visited[i][j] = true;
        if(word.charAt(0)!=board[i][j])
            return false;
        else
            word = word.substring(1);
        System.out.println(word);
        if(word.length()==0 || word.charAt(0)=="")
        {
            System.out.println(true);
            return true;
        }
        for(int k=0; k<dir.length; k++)
        {
            int x = dir[k][0], y=dir[k][1]; //{{-1,0},{0,1},{1,0},{0,-1}}
            if(i+x>=0 && i+x <board.length && j+y>=0 && j+y <board[0].length && visited[i+x][j+y]==false)
            {
                boolean a = helper(board, word, visited, i+x, j+y);
                if(a==true)
                    return true;
            }
        }
        //
        visited[i][j] = false;
        return false;
    }
}*/