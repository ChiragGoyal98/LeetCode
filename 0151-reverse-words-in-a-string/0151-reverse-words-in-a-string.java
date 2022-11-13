class Solution {
    public String reverseWords(String s) {
        Stack<String> stck = new Stack<>();
        String word="";
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                if(word != "")
                {
                    stck.push(word);
                    System.out.println(word);
                    word = "";
                }
            }
            else{
                word += s.charAt(i);
            }
        }
        if(word != "")
            stck.push(word);
        StringBuilder ans = new StringBuilder();
        while(stck.isEmpty() != true)
        {
            ans.append(stck.peek());
            stck.pop();
            if(stck.size() != 0)
                ans.append(" ");
        }
        System.out.println(ans);
        return ans.toString();
    }
}