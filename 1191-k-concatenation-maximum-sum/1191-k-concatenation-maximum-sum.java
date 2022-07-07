class Solution {

    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        int ans=0;
        if(k==1){
            ans=(int)(kadans(arr)%1000000007);
            return Math.max(ans,0);
        }

        int a[]=new int[2*arr.length];
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            a[i]=a[i+n]=arr[i];
        }
        if(sum<0){

            ans=(int)(kadans(a)%1000000007);
            return Math.max(ans,0);
        }else{
            ans=(int)((kadans(a)+(k-2)*sum)%1000000007);
            return Math.max(ans,0);
    }
}
    public static int kadans(int[] arr) {
    // write your code here
        int []dp = new int[arr.length];
        dp[0] = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
          dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
          max = Math.max(max,dp[i]);
        }
        return max;
    }
}
  