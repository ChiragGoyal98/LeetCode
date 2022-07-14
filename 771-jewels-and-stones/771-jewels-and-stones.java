class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        HashMap<Character, Boolean> hm = new HashMap<>();
        for(int i=0; i<jewels.length(); i++)
        {
            hm.put(jewels.charAt(i),true);
        }
        for(int i=0; i<stones.length(); i++)
        {
            if(hm.containsKey(stones.charAt(i)))
                ans++;
        }
        return ans;
    }
}