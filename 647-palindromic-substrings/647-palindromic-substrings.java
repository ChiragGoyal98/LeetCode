class Solution {
    int ans = 0;
    public int countSubstrings(String s) {
        dfs(s,0);
        return ans;
    }
    
    public void dfs(String s, int start){
        if(start == s.length())
            return;
        
        for(int i = start; i<s.length(); i++)
        {
            if(isPalindrome(start, i, s))
                ans++;
        }
        
        dfs(s, start+1);
    }
     public static boolean isPalindrome(int start, int end,String s){
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}