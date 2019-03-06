class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        long res =  x;
        while ( res > x/res){
            res = (res + x/res)/2;
         }
        return (int)res;
    }
}