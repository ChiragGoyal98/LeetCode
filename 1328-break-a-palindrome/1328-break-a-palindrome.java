class Solution {
    public String breakPalindrome(String palindrome) {
        // if(palindrome.length() == 1)
        //     return "";
        // int len = palindrome.length();
        // char ans[] = new char[len];
        // if(allAs(palindrome))
        // {
        //     for(int i=0; i<len-1; i++)
        //         ans[i] = palindrome.charAt(i);
        //     ans[len-1]='b';
        //     return String.valueOf(ans);
        // }
        // boolean flag = false;
        // int i;
        // for(i=0; i<len; i++)
        // {
        //     if(palindrome.charAt(i) != 'a' && flag == false)
        //     {
        //         ans[i] = 'a';
        //         System.out.print(i);
        //         flag = true;
        //     }
        //     else
        //         ans[i] = palindrome.charAt(i);
        // }
        // String fAns = String.valueOf(ans);
        // if(allAs(fAns))
        // {
        //     for(i=0; i<len-1; i++)
        //         ans[i] = palindrome.charAt(i);
        //     ans[len-1]='b';
        //     return String.valueOf(ans);
        // }
        // // while(i<len)
        // // {
        // //     ans[i] = palindrome.charAt(i);
        // //     i++;
        // // }
        // return String.valueOf(ans);
        if(palindrome.length() == 0 || palindrome.length() == 1){
            return "";
        }
        char[] ch = palindrome.toCharArray();
        for(int i = 0;i<ch.length/2;i++){
            if(ch[i]-'a' != 0){
                ch[i] = 'a';
                return new String(ch);
            }
            
        }
        ch[ch.length-1] = 'b';
        return new String(ch);
        
    }
    // public boolean allAs(String str)
    // {
    //     for(int i=0; i<str.length(); i++)
    //         if(str.charAt(i) !='a')
    //             return false;
    //     return true;
    // }
}