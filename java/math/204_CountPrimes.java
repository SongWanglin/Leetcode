class Solution {
    public int countPrimes(int n) {
        if (n<=2)
            return 0;
        int  res = 0;
        boolean[] isPrime = new boolean[n+1];
        for(int i = 2; i<n+1; i++){
            isPrime[i] = true;
        }
        for (int i = 2; i*i<n; i++){
            if(isPrime[i]){
                for (int j = i*i; j<n+1; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for (int i=0; i<n; i++){
            res+= (isPrime[i])? 1: 0;
        }
        return res;
    }
}
