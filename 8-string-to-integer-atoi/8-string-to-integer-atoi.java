class Solution {
  public int myAtoi(String str) {
    
    final int len = str.length();
    
    if (len == 0){
        return 0;
    }
    
    int index = 0;
    
    // skipping white spaces
    while (index < len && str.charAt(index) == ' '){
        ++index;
    }
    
    boolean isNegative = false;
    
    // to handle sign cases
    if (index < len) {
      
      if (str.charAt(index) == '-') {
        isNegative = true;
        ++index;
      } else if (str.charAt(index) == '+'){
          ++index;
      }
      
    }
    
    int result = 0;
    
    // converting digit(in character form) to integer form
    // iterate until non-digit character is not found or we can say iterate till found character is a digit
    while (index < len && isDigit(str.charAt(index))) {
      
      /* str.charAt(index) - '0' is to convert the char digit into int digit eg: '5' - '0' --> 5
      or else it will store the ASCII value of 5 i.e. 53,
      so we do 53(ASCII of 5) - 48(ASCII of 0(zero)) to get 5 as int*/
      int digit = str.charAt(index) - '0';
      
      // to avoid integer overflow
      if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
          return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      }
      
      // adding digits at their desired place-value
      result = (result * 10) + digit;
      
      ++index;
    }
      
    return isNegative ? -result : result;
  }
  
  private boolean isDigit(char ch) {
    return ch >= '0' && ch <= '9';
  }
}
// class Solution {
//     public int myAtoi(String s) {
//         int multiplier=1;
//         int ans=0;
//         int i=0;
//         while (i < s.length()  && s.charAt(i) == ' '){
//             ++i;
//         }
//         if (i < s.length()) {
      
//             if (s.charAt(i) == '-') {
//                 multiplier=-1;
//                 ++i;
//             } else if (s.charAt(i) == '+'){
//                 ++i;
//             }
      
//         }
//         while (i < s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9'))
//         {    
//             int digit = (int)(s.charAt(i) - '0');
//             if(ans > (Integer.MAX_VALUE / 10) ||(ans == (Integer.MAX_VALUE / 10)&&digit > 7)){
//                 return multiplier==-1 ?Integer.MIN_VALUE : Integer.MAX_VALUE;
//             }
//             if((s.charAt(i)>='0' && s.charAt(i)<='9'))
//                 ans= ans*10 + (int) (s.charAt(i)-'0');
//             else
//                 break;
            
      
//         }
//         return ans*multiplier;
//     }
// }