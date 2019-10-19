/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0, end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(!isBadVersion(mid)){
                start = mid+1;
            }else if(mid==0 || !isBadVersion(mid-1) ){
                return mid;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
