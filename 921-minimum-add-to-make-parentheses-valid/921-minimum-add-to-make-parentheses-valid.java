class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stck = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(')
                stck.push('(');
            else if(s.charAt(i) == ')')
            {
                if(stck.size()==0)
                    count++;
                else
                    stck.pop();
            }
        }
        return count + stck.size();
        
    }
}