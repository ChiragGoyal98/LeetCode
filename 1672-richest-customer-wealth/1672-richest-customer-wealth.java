class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum=-1;
        int n=accounts.length, m=accounts[0].length;
    for(int i=0; i<n; i++)
    {
        int s=0;
        for(int j=0; j<m; j++)
        {
            s+=accounts[i][j];
        }
        if(maxSum<s)
            maxSum  = s;
    }
        return maxSum;
    }
}