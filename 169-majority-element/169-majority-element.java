class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int ele:nums)
        {
            hm.put(ele,hm.getOrDefault(ele,0)+1);
            if(hm.get(ele)>n/2)
                return ele;
        }
        return -1;
    }
}