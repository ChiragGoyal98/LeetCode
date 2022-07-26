class Solution {
    public double knightProbability(int n, int k, int r, int c) {
        if(k == 0)
            return 1.0;
        if(n == 1)
            return 0.0;
		
		double arr1[][] = new double[n][n];
		double arr2[][] = new double[n][n];;

		arr1[r][c] = 1.0;

		int dir[][] = {{-2,-1}, {-2,1}, {-1,2}, {1,2}, {2,1}, {2,-1}, {1,-2}, {-1,-2}};
		double ans = 0.0;
		for(int K=1; K<=k; K++){
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					if(arr1[i][j]!=0)
					{
						for(int d = 0; d<dir.length; d++)
						{
							int x = i + dir[d][0];
							int y = j + dir[d][1];

							if(x>=0 && x<n && y>=0 && y<n)
							{
								arr2[x][y] += arr1[i][j]/8.0;
							}
						}
					}
				}
			}
			arr1 = arr2;
			arr2 = new double[n][n];
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				ans += arr1[i][j];
			}
		}
		return ans;
    }
}