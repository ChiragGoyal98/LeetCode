class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int ele:nums)
        {
            hm.put(ele, hm.getOrDefault(ele,0)+1);
            if(hm.get(ele)>1)
                ans.add(ele);
        }
        return ans;
    }
}