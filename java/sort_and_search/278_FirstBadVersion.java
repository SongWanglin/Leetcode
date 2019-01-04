/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n<2)
            return 1;
        int start = 1, end = n, mid = 0;
        while (start<end){
            mid = (end-start)/2+start;
            if (isBadVersion(mid)){
                end = mid;
            } else{
                start = mid+1;
            }
        }
        if (!isBadVersion(mid))
            return mid+1;
        return mid;
    }
}
