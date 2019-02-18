import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len== 0){
            return 0;
        }
        int start = 0, end = len-1, mid = 0;
        while(start <= end){
            mid = (start + end)/2;
            if(array[start] <=array[mid] && array[end] <=array[mid]){
                start = mid+1;
            } else{
                end = mid;
            }
        }
        return array[mid];
    }
}
