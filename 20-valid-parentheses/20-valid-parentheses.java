class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        int n = s.length();
        
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='[' || s.charAt(i) == '{' || s.charAt(i) == '(')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ']')
            {
                if(stack.empty()==false && stack.peek().equals('['))
                    stack.pop();
                else
                    return false;
            }
            else if(s.charAt(i) == '}')
            {
                if(stack.empty()==false && stack.peek().equals('{'))
                    stack.pop();
                else
                    return false;
            }
            else if(s.charAt(i) == ')')
            {
                if(stack.empty()==false && stack.peek().equals('('))
                    stack.pop();
                else
                    return false;
            }
        }
        if(stack.empty()==true)
            return true;
        else
            return false;
        
    }
}