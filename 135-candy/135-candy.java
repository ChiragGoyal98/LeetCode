class Solution {
    public int candy(int[] ratings) {
//         int lastCC = 1;
//         int ans = 0;
//         if(ratings[0] > ratings[1])
//             ans = 2;
//         else ans = 1;
//         lastCC = ans;
//         for(int i=1; i<ratings.length; i++)
//         {
//             if(ratings[i]>ratings[i-1])
//             {
//                 ans += lastCC + 1;
//                 lastCC++;
//             }
//             else if(ratings[i] == ratings[i-1] && i!=ratings.length-1 && ratings[i] >ratings[i+1]){
//                 ans+=lastCC+1;
//                 lastCC++;
//             }
//             else{
//                 ans++;
//                 lastCC=1;
//             }
                          
//         }
//         return ans;
        int []candies = new int[ratings.length];
        int ans = 0;
        Arrays.fill(candies,1);
        
        //l to r
        for(int i=1; i<ratings.length; i++)
        {
            if(ratings[i]>ratings[i-1])
                candies[i] = candies[i-1]+1;
        }
        //r to l
        for(int i = ratings.length-2; i>=0; i--)
        {
            if(ratings[i]>ratings[i+1])
                candies[i] = Math.max(candies[i+1]+1, candies[i]);
            ans+=candies[i];
        }
        // for(int ele: candies)
        //     ans+=ele;
        return ans + candies[ratings.length-1];
    }
}