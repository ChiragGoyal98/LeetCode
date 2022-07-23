class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int lDay = days[days.length-1];
        int []dp = new int[lDay+1];
        boolean travelDay[] = new boolean[lDay+1];
        
        for(int d: days)
            travelDay[d] = true;
        
        for(int i = 1; i <= lDay; i++){
            if(travelDay[i] == false)
                dp[i] = dp[i-1];
            else{
                dp[i] = Math.min(dp[i-1] + costs[0], Math.min(dp[Math.max(i-7, 0)] + costs[1], dp[Math.max(i-30, 0)] + costs[2]));
            }
        }
        return dp[lDay];
    }
}