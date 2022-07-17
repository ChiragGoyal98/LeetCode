class Solution {
    public boolean stoneGame(int[] piles) {
        Integer [][]dp = new Integer[piles.length][piles.length];
        int ans = helper(0, piles.length-1, piles, 1, dp);
        if(ans>1)
            return true;
        return false;
    }
    public int helper(int left, int right, int []piles, int turn, Integer [][]dp){
        if(right<0 || left >=piles.length)
            return 0;
        if(dp[left][right]!=null)
            return dp[left][right];
        int ans = 0;
        if(turn == 1)
            ans = Math.max(piles[left] + helper(left+1, right, piles, 0, dp), piles[right] + helper(left, right-1, piles, 0, dp));
        else
            ans = Math.max(piles[left] + helper(left+1, right, piles, 1, dp), piles[right] + helper(left, right-1, piles, 1, dp));
        return dp[left][right] = ans;
    }
    
}

/*
public boolean helper(int left, int right, int []piles, int turn, int [][]dp){
        if(left>=right)
            return Alice>Bob ? true : false;
        if(turn)
        {
            boolean a = helper(piles, left+1, right, Alice + piles[left], Bob, !turn);
            if(a)
                return true;
            a = helper(piles, left, right-1, Alice + piles[right], Bob, !turn);
            if(a)
                return true;
        }
        else{
            boolean a = helper(piles, left+1, right, Alice, Bob + piles[left], !turn);
            if(a)
                return true;
            a = helper(piles, left, right-1, Alice, Bob + piles[right], !turn);
            if(a)
                return true;
        }
        return false;
    }*/