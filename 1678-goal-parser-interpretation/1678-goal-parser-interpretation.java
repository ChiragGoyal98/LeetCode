class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<command.length();)
        {
            if(command.charAt(i) == 'G')
            {
                ans.append("G");
                i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')')
            {
                ans.append("o");
                i+=2;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                ans.append("al");
                i+=4;
            }
        
                //i++;
        }
        return ans.toString();
    }
}