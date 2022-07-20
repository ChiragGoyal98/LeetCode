class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Integer> stck = new Stack();
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i] == '(')
                stck.push(i);
            else if(ch[i] == ')'){
                if(stck.isEmpty())
                    ch[i] = '#';
                else
                    stck.pop();
            }
        }
        while(!stck.isEmpty())
        {
            ch[stck.peek()] = '#';
            stck.pop();
        }
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]!='#')
                str.append(ch[i]);
        }
        return str.toString();
    }
}