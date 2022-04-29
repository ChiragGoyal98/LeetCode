class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxC=0;
        for(int i=0; i<candies.length; i++)
        {
            maxC = Math.max(maxC,candies[i]);
        }
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
		   ans.add(candies[i] + extraCandies >= maxC);
        }
        // boolean ans[] = new boolean[candies.length];
        // for(int i=0; i<candies.length; i++){
        //     if(candies[i]+extraCandies > maxC)
        //         ans[i]=true;
        //     else
        //         ans[i]=false;
        // }
        return ans;
    }
}