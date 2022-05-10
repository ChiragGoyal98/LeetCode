class Solution {
    public boolean isPowerOfFour(int n) {
        double a = Math.log(n) / Math.log(4);
        return Math.abs(a - Math.round(a)) < 1e-10;
    }
}