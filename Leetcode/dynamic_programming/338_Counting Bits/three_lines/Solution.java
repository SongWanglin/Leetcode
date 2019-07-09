class Solution {
    public int[] countBits(int num) {
        /*/
        int[] res = new int[num+1];
        for(int i = 0; i <= num; i++){
            res[i] = bits(i);
        }
        return res;/*/
        int[] f = new int[num + 1];
        // the i%2th element plus last digit
        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }
    /*/
        private int bits(int n) {
            int count = 0;
            while(n!=0){
                n = (n&(n-1));
                count++;
            }
            return count;
        }/*/
}
