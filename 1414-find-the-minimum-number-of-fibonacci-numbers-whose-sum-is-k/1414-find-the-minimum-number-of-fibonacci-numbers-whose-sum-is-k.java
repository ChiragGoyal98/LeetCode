class Solution {
    public int findMinFibonacciNumbers(int k) {
        int ans = 0;
        while(k>0)
        {
            int first = 1;
            int second = 1;
            while(second<=k)
            {
                int t = first + second;
                first = second;
                second = t;
            }
            k -= first;
            ans ++;
        }
        return ans;
    }
}