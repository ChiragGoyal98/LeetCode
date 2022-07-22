class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            if(hm.get(temp) == null){
                List<String> smallAns = new ArrayList<>();
                smallAns.add(strs[i]);
                hm.put(temp, smallAns);
            }else{
                hm.get(temp).add(strs[i]);
            }
        }
        return new ArrayList(hm.values());
            
    }
}