class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0, ans = 0;
        for(int i=1; i<=nums.length; i++)
        {
            sum += nums[i-1];
            int s = sum%k;
            if(s<0)
                s+=k;
            if(map.containsKey(s))
                ans += map.get(s);
            map.put(s, map.getOrDefault(s,0)+1);
        }
        return ans;
    }
}