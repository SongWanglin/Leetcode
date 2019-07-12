class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        while(n>=0){
            i++;
            n-=i;
        }
        return i-1;
    }
}
