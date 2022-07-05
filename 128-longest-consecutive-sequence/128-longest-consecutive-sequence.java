class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;// answer len
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        
        for(int i:nums){
            int maxLen = 1, prev = i-1, next = i+1;
            while(set.contains(prev))
            {
                maxLen++;
                set.remove(prev);
                prev--;
            }
            while(set.contains(next))
            {
                maxLen++;
                set.remove(next);
                next++;
            }
            ans = maxLen>ans ? maxLen : ans;
        }
        return ans;
    }
}