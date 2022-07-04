class Solution {
    public int candy(int[] ratings) {
        int size = ratings.length;
        int []candiesDistributed = new int[ratings.length];
        int ans = 0;
        Arrays.fill(candiesDistributed,1);
        for(int i=1; i<size; i++)
        {
            if(ratings[i]>ratings[i-1])
                candiesDistributed[i] = candiesDistributed[i-1]+1;
        }
        for(int i = size-2; i>=0; i--)
        {
            if(ratings[i]>ratings[i+1])
                candiesDistributed[i] = Math.max(candiesDistributed[i+1]+1, candiesDistributed[i]);
            ans+=candiesDistributed[i];
        }
        return ans + candiesDistributed[size-1];
    }
}