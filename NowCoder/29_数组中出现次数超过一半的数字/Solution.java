public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0)
            return 0;
        return helper(array, 0, array.length-1);
    }
        private int helper(int[] array, int start, int end){
            if( end-start==0)
                return array[start];
            if( end-start==1)
                return (array[end]==array[start])?array[start]: 0;
            int left = helper(array, start, (start+end)/2);
            int right = helper(array, (start+end)/2+1, end);
            int left_count = 0, right_count = 0;
                for(int i = start; i<=end; i++){
                    if(array[i]==left){
                        left_count++;
                    }
                    if(array[i]==right){
                        right_count++;
                    }
                }
            return (left_count>(end-start+1)/2)?left:
                   (right_count>(end-start+1)/2)?right: 0;
                }
        }
