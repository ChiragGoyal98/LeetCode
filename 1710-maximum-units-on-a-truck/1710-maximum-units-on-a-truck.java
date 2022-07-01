class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
//         int [][]dp = new int[boxTypes.length+1][truckSize+1];
        
//         int n = dp.length, m = dp[0].length;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(j==0 || i==0)
//                     dp[i][j] = 0;
//                 else{
//                     int np = dp[i-1][j];
//                     int participated = Integer.MIN_VALUE;
//                     if(j - boxTypes[i-1][0]>=0){
//                         participated = dp[i-1][j-boxTypes[i-1][0]] + boxTypes[i-1][1];
//                     }
//                     dp[i][j] = Math.max(np,participated);
//                 }
//             }
//         }
//         return dp[n-1][m-1];
        
        Arrays.sort(boxTypes, Comparator.comparingInt(boxType -> -boxType[1]));
        
        var ans = 0;
        for(int[] b:boxTypes)
        {
            ans += Math.min(truckSize,b[0]) * b[1];
            truckSize-=b[0];
            if(truckSize<0)
                break;
        }
        return ans;
    }
}