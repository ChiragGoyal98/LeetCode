class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = s.length();
        for(int i=0; i<len; i++)
        {
            hm.put(s.charAt(i), i);
        }
        System.out.println(hm);
        int prev = -1;
        List<Integer> ans =  new ArrayList<>();
        int max = hm.get(s.charAt(0));
        for(int i=0; i<len; i++){
            if(i==max)
            {
                ans.add(max-prev);
                prev = max;
                if(i==len-1)
                    break;
                max = hm.get(s.charAt(i+1));
            }
            else
            {
                max = Math.max(max, hm.get(s.charAt(i)));    
            }
        }
        return ans;
        
        
    }
}