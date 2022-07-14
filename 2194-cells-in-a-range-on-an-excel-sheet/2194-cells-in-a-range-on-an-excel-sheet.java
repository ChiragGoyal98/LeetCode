class Solution {
    public List<String> cellsInRange(String s) {
        char x1 = s.charAt(0);
        char x2 = s.charAt(3);
        char y1 = s.charAt(1);
        char y2 = s.charAt(4);
        List<String> ans = new ArrayList<>();
        for(char i = x1; i<=x2; ++i)
        {
            for(char c = y1; c<=y2; ++c)
            {
                ans.add("" + i + c);
            }
        }
        return ans;
    }
}