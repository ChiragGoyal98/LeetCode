class Solution {
    public boolean isHappy(int n) {
        
        // while(n>9)
        // {
        //     int t=n;
        //     int k=0;
        //     while(t>0)
        //     {
        //         int rem=t%10;
        //         k+=rem*rem;
        //         t=t/10;
        //     }
        //     n=k;
        //     System.out.println(k);
        // }
        // if(n == 1 ||n == 7)
        //     return true;
        // else
        //     return false;
        if(n<=0) return false;
        while(true){
            int sum=0;
            while(n!=0){
              sum+=(n%10)*(n%10);
              n=n/10;
            }
            if(sum/10==0){
               if(sum==1||sum==7) return true;
               else return false;
            }
            n=sum;
        }
    }
}