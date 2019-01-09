class Solution {
    public int fib(int N) {
        return (N<2)? N: fib(N-2)+fib(N-1);
    }
}
