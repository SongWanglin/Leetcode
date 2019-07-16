class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n != 0) && (n != -2147483648) && ((n & (n-1)) == 0);
    }
}
