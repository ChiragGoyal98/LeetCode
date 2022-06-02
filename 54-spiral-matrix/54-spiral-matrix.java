class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr = 0, sc = 0, er = matrix.length-1, ec = matrix[0].length-1;
        int n = matrix.length, m = matrix[0].length;
        int count = 0;
        List<Integer> ans = new ArrayList<Integer>();
        while(count<n*m)
        {
            int j = sc;
            while(j<=ec && count<n*m)
            {
                ans.add(matrix[sr][j]);
                j++;
                count++;
            }
            sr++;
            int i = sr;
            while(i<=er && count<n*m)
            {
                ans.add(matrix[i][ec]);
                i++;
                count++;
            }
            ec--;
            j = ec;
            while(j>=sc && count<n*m)
            {
                ans.add(matrix[er][j]);
                j--;
                count++;
            }
            er--;
            i = er;
            while(i>=sr && count<n*m)
            {
                ans.add(matrix[i][sc]);
                i--;
                count++;
            }
            sc++;
            
        }
        return ans;
    }
}