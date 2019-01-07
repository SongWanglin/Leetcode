class Solution {
    public int countPrimes(int n) {
        if (n<=2)
            return 0;
        int  res = 0;
        boolean[] noPrime = new boolean[n+1];
        for (int i = 2; i*i<=n; i+=1){
            if (noPrime[i]){
                continue;
            }
            for (int j = i*i; j<=n; j+=i){
                noPrime[j] = true;
            }
        }
        for (int i=2; i<n; i++){
            res+= (noPrime[i])? 0: 1;
        }
        return res;
    }
}
