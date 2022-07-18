class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int memo1[] = new int[n];
        int memo2[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            int c1 = 0, c2 = 0;
            for(int j=i+1; j<n; j++)
            {
                if(rating[i]<rating[j])
                    c1++;
                if(rating[i]>rating[j])
                    c2++;
            }
            memo1[i] = c1;
            memo2[i] = c2;
        }
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            int c1 = 0, c2 = 0;
            for(int j=i+1; j<n; j++)
            {
                if(rating[i]<rating[j] && memo1[j]>0)
                    c1 += memo1[j];
                if(rating[i]>rating[j] && memo2[j]>0)
                    c2 += memo2[j];
            }
            ans += c1+c2;
        }
        return ans;
        
    }
}