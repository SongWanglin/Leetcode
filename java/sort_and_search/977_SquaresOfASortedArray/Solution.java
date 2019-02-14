class Solution {
    public int[] sortedSquares(int[] A) {
        int resEnd = A.length - 1, start = 0, end = A.length-1;
        int[] res = new int[A.length];
        while (start<= end){
            if(A[start]*A[start]<=A[end]*A[end]){
                res[resEnd--] = A[end]*A[end];
                end--;
            } else{
                res[resEnd--] = A[start]*A[start];
                start++;
            }
        }
        return res;
    }
}
