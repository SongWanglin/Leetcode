class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1) return x;
        int start = 0, end = x;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid<=x/mid && x/(mid+1)<(mid+1))
                return mid;
            if( mid>x/mid){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
