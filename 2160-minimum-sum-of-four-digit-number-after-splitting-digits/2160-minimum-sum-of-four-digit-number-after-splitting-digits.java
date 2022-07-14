class Solution {
    public int minimumSum(int num) {
        int n1=0, n2 = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE, min4 = Integer.MAX_VALUE;
        int arr[] = new int[4];
        int k=10;
        for(int i=0; i<4; i++)
        {
            int rem = num%k;
            if(min1>rem)
            {
                min4 = min3;
                min3 = min2;
                min2 = min1;
                min1 = rem;
            }else if(min2>rem){
                min4 = min3;
                min3 = min2;
                min2 = rem;
            }else if(min3>rem){
                min4 = min3;
                min3 = rem;
            }else
                min4 = rem;
            num = num/k;
            //k = k/10;
        }
        return min1*10 + min2*10 + min3 + min4;
    }
}