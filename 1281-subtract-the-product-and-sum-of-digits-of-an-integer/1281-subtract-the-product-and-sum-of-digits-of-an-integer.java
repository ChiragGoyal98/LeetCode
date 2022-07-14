class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, prod = 1;
        while(n>0)
        {
            int rem = n%10;
            n /= 10;
            sum += rem;
            prod *= rem;
        }
        return prod - sum;
    }
}