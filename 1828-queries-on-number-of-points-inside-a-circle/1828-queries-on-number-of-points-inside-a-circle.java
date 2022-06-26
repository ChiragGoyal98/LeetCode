class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[] = new int[queries.length];
        
        for(int i=0; i<queries.length; i++)
        {
            int x1 = queries[i][0], y1 = queries[i][1], r = queries[i][2];
            for(int j=0; j<points.length; j++)
            {
                int x2 = points[j][0], y2 = points[j][1];
                ans[i] += isInside(x1,y1,x2,y2,r);
            }
        }
        return ans;
    }
    public int isInside(int x1, int y1, int x2, int y2, int r)
    {
        r *= r;
        int dist = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        if(dist<=r)
            return 1;
        return 0;
        
    }
}