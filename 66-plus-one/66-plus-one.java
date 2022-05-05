class Solution {
    public int[] plusOne(int[] digits) {
        int size=digits.length;
        if(digits[size-1]<9)
            digits[size-1]++;
        else
        {
            int carry=1;
            //digits[size-1] = 0;
            int i=size-1;
            while(carry!=0 && i>=0)
            {
                int t = (digits[i]+carry)/10;
                digits[i] = (digits[i]+carry)%10;
                carry = t;
                i--;
            }
            if(carry==1)
            {
                int ans[] = new int[size+1];
                ans[0] = carry;
                for(i=1; i<size+1; i++)
                {
                    ans[i] = digits[i-1];
                }
                return ans;

            }
        }
        
        return digits;
    }
}