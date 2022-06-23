class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        
        for(int ele : nums)
        {
            hm1.put(ele, hm1.getOrDefault(ele,0)+1);
            if(hm1.get(ele)>1)
                return true;
        }
        
        // for(int ele : nums){
        //     if(hm1.get(ele)>1)
        //         return true;
        // }
        return false;
    }    
}