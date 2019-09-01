import java.math.BigInteger;
class Solution {
    public int numPrimeArrangements(int n) {
        if(n<=2)
            return 1;
        int primeCount = 0;
        for(int i = 2; i<=n; i++){
            if(isPrime(i))
                primeCount++;
        }
        BigInteger a = factorial(primeCount);
        BigInteger b = factorial(n-primeCount);
        BigInteger res = a.multiply(b);
        return res.mod(BigInteger.valueOf(1_000_000_007)).intValue();
    }
        private BigInteger factorial(int n){
            BigInteger fact = BigInteger.valueOf(1);
            for (int i = 1; i <= n; i++) {
               fact = fact.multiply(BigInteger.valueOf(i));
            }
            return fact;
        }
        private boolean isPrime(int n) {
            int count = 0;
            for(int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    count++;
                }
                if(count > 2) {
                    return false;
                }
            }
            return true;
        }
}
