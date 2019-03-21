public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length<1){
            return 0;
        }
        int start = 0, end = array.length-1, count = 0, mid = (start+end)/2;
        while(start<=end){
            mid = (start+end)/2;
            if(array[mid]==k){
                break;
            } else if(array[mid]<k){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        if(start>end){
            return 0;
        }
        int tmp = mid;
        while(tmp>=0 && array[tmp]==k ){
            count++;
            tmp--;
        }
        tmp = mid;
        while(tmp<=end && array[tmp]==k){
            count++;
            tmp++;
        }
        return count-1;
    }
}
