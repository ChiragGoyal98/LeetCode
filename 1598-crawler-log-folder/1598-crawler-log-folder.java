class Solution {
    public int minOperations(String[] logs) {
        Stack<Boolean> stck = new Stack<>();
        
        for(String var : logs)
        {
            switch (var){
                case "../":{
                    if(stck.size()!=0)
                        stck.pop();
                    break;
                }
                case "./":{
                    break;
                }
                default:{
                    stck.push(true);
                    break;
                }
            }
        }
        int size = 0;
        // while(stck!=0)
        // {
        //     stck.pop();
        //     size++;
        // }
        return stck.size();
    }
}