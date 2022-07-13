class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j]==1)
                    ans = Math.max(ans, helper(grid, i, j));
            }
        }
        return ans;
    }
    public int helper(int [][]grid, int i, int j)
    { 
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==1)
        {
            grid[i][j] = 0;
            return 1 + helper(grid, i+1, j) + helper(grid, i, j+1) + helper(grid, i-1, j) + helper(grid, i, j-1);
        }
        return 0;
    }
}