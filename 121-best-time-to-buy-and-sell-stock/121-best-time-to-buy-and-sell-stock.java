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
        int lp=Integer.MAX_VALUE;
        int p = 0;
        int pt=0;
        for(int i=0; i<prices.length; i++)
        {
            lp = Math.min(lp, prices[i]);
            pt = prices[i] - lp;
            p = Math.max(p, pt);
        }
        return p;
    }
}