class Solution {
    public int maxProfit(int[] prices) {
//         int maxDiff=0, size=prices.length;
        
//         for(int i=0; i<size-1; i++)
//         {
//             int diff=-1;
//             for(int j=i+1; j<size; j++)
//             {
//                 maxDiff = Math.max(maxDiff,prices[j] - prices[i]);
//             }
//         }
//         return maxDiff;
        int leastSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profitIfSoldToday = 0;
        
        for(int ele : prices)
        {
            if(ele < leastSoFar)
                leastSoFar = ele;
            
            profitIfSoldToday = ele - leastSoFar;
            maxProfit = Math.max(maxProfit, profitIfSoldToday);
        }
        return maxProfit;
    }
}