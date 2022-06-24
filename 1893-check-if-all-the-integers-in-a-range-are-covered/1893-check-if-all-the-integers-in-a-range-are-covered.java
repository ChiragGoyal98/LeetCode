class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int i = 0 ; i<ranges.length; i++)
        {
            for(int j = ranges[i][0]; j<=ranges[i][1]; j++)
            {
                hm.put(j, true);
            }
        }
        //System.out.println(hm);
        for(int i = left; i<=right; i++)
        {
            if(hm.containsKey(i))
                continue;
            return false;
        }
        return true;
    }
}