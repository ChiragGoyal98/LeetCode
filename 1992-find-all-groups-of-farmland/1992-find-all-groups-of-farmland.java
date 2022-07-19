class Solution {
    private int dir[][] = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    public int[][] findFarmland(int[][] land) {
        int row = land.length;
        int col = land[0].length;
        List<int[]> ans = new ArrayList<>();
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(land[i][j] == 1)
                {
                    int arr[] = new int[]{i,j,0,0};
                    dfs(land, i, j, arr);
                    ans.add(arr);
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    
    public void dfs(int [][]land, int i, int j, int []arr)
    {
        if(i<0 || j<0 || i>=land.length || j>=land[0].length)
            return;
        if(land[i][j]==0)
            return;
        land[i][j] = 0;
        arr[2] = Math.max(i, arr[2]);
        arr[3] = Math.max(j, arr[3]);
        
        for(int k = 0; k<4; k++)
        {
            int x = dir[k][0];
            int y = dir[k][1];
            dfs(land, i+x, j+y, arr);
        }
        
        
    }
}