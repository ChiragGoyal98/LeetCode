class Solution {
    public int minOperations(String[] logs) {
//         var stck = new Stack<>();
        
//         for(String log : logs)
//         {
//             // switch (var){
//             //     case "../":{
//             //         if(stck.size()!=0)
//             //             stck.pop();
//             //         break;
//             //     }
//             //     case "./":{
//             //         break;
//             //     }
//             //     default:{
//             //         stck.push(true);
//             //         break;
//             //     }
//             // }
//             if(log.equals("../")){
//                 if(!stck.empty())
//                     stck.pop();
//             }else if(log.equals("./")){

//             }else{
//                 stck.push(log);
//             }
//         }
        
//         // while(stck!=0)
//         // {
//         //     stck.pop();
//         //     size++;
//         // }
//         return stck.size();
        var stack = new Stack<String>();
        for(var log : logs){
            if(log.equals("../")){
                if(!stack.empty())
                    stack.pop();
            }else if(log.equals("./")){

            }else{
                stack.push(log);
            }
        }
        return stack.size();
    }
}