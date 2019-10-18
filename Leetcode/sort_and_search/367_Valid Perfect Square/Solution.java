class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        long start = 0, end = num/2;
        while(start<=end){
            long mid = (start+end)/2;
            if(mid*mid == (long)num) return true;
            if( mid*mid>(long)(num)){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
