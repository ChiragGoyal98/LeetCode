import java.util.*;  
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int ele : nums1)
        {
            hm.put(ele, hm.getOrDefault(ele,0)+1);
        }
        
        Vector<Integer> ans = new Vector<Integer>();  
        
        for(int ele: nums2){
            if(hm.containsKey(ele) && hm.get(ele)>0)
            {
                ans.add(ele);
                hm.put(ele, hm.get(ele)-1);
            }
        }
        int res[] = new int[ans.size()];
        int i=0;
        for(Integer v:ans)
        {
            res[i++] = v;
        }
        return res;
        
    }
}