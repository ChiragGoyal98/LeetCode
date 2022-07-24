class Solution {
    int [][]dir = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    public boolean containsCycle(char[][] grid) {
        boolean [][]vis = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++)
        {
            for(int j = 0; j<grid[0].length; j++){
                if(vis[i][j] == false)
                    if(helper(grid, i, j, grid[i][j], vis))
                        return true;
            }
        }
        return false;
    }
    
    public boolean helper(char [][]grid, int i, int j, char value, boolean [][]vis){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] != value)
            return false;
        if(vis[i][j])
            return true;
        
        vis[i][j] = true;
        grid[i][j] = '!';
        
        //System.out.print(grid[i][j]+" ");
        for(int k=0; k<dir.length; k++)
        {
            int x = i+dir[k][0];
            int y = j+dir[k][1];
            if(helper(grid, x, y, value, vis))
                return true;
        }
        grid[i][j] = value;
        return false;
    }
}