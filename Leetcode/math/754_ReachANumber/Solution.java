class Solution {
    public int reachNumber(int target) {
        int res = Math.abs(target);
        int n = 0;
        while(res>n*(n+1)/2){
            n++;
        }
        return (n*(n+1)/2==res) ? n:
               (n*(n+1)/2-res)%2==0 ? n:
                n%2==0 ? n+1: n+2;
        }
}
