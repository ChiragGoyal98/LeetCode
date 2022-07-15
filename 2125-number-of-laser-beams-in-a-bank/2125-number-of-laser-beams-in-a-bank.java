class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> dp = new ArrayList<>();
        int cr=0;
        for(int i=0; i<bank.length; i++)
        {
            int sum = 0;
            for(int j=0; j<bank[i].length(); j++)
            {
                if(bank[i].charAt(j) == '1')
                    sum++;
            }
            if(sum!=0)
                dp.add(sum);
        }
        if(dp.size()==1)
            return 0;
        int i=0;
        int ans = 0;
        while(i<dp.size()-1)
        {
            ans += dp.get(i)*dp.get(i+1);
            i++;
        }
        return ans;
            
    }
}