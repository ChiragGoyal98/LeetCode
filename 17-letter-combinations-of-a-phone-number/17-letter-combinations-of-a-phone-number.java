class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        String[] dic = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> ans = new ArrayList<>();
        backtrack(ans, digits.toCharArray(), "", dic);
        return ans;
    }
    public void backtrack(List<String> ans, char[] digits, String temp, String[] dic)
    {
        if(temp.length() == digits.length)
        {
            ans.add(temp);
            return;
        }
        //int i = temp.length();
        int i = temp.length();
        int digit = digits[i] - '0';
        for (char letter : dic[digit].toCharArray()) {
            backtrack(ans, digits, temp + Character.toString(letter), dic);
        }
    }
}











/*
if(digits.length()==0)
        {
            List<String> base = new ArrayList<String>();;
            return base;
        }
        
        int n = (int)(digits.charAt(0)-'0');
        digits = digits.substring(1);
        List<String> smallAns = letterCombinations(digits);
        if(smallAns.size()==0)
            smallAns.add("");
        String word = dic[n-1];
        List<String> finalAns = new ArrayList<String>();; 
        for(int j=0; j<smallAns.size(); j++)
        {
            for(int i=0; i<word.length(); i++)
            {
                finalAns.add(word.charAt(i)+smallAns.get(j));
            }
        }
        return finalAns;
        */