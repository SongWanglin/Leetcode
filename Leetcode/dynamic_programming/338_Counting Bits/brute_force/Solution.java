class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i = 0; i <= num; i++){
            res[i] = bits(i);
        }
        return res;
    }
        private int bits(int n) {
            int count = 0;
            while(n!=0){
                n = (n&(n-1));
                count++;
            }
            return count;
        }
}
