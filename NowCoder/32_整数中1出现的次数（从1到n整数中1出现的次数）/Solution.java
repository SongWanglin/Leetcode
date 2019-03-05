public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        //brute force
        /*/
        int res = 0;
        while(n>0){
            res += Ones(n);
            n--;
            }
        return res;
        /*/
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i,b = n % i;
            count += (a + 8) / 10 * i + ((a % 10 == 1) ? b + 1 : 0);
        }
        return count;
    }
    /*/
        private int Ones(int n){
            int res = 0;
            while(n!=0){
                if(n%10==1){
                    res++;
                }
                n = n/10;
            }
            return res;
        }
        /*/
}
