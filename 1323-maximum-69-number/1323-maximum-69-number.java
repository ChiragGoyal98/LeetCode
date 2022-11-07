class Solution {
    public int maximum69Number (int num) {
        int digits[] = new int[5];
        int i=4;
        while(num>0)
        {
            int r = num%10;
            digits[i--] = r;
            num /= 10;
        }
        int ans = 0;
        boolean flag = false;
        for(i=0; i<5; i++)
        {
            ans *= 10;
            if(digits[i] == 6 && flag == false)
            {
                ans += 9;
                flag = true;
            }
            else
                ans += digits[i];
        }
        return ans;
        
    }
}