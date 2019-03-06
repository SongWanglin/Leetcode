class Solution {
    public boolean isMonotonic(int[] A) {
        int diff = 0;
        for (int i = 0; i < A.length-1; i++){
            if (A[i+1] == A[i]) {
                continue;
            }
            if ( (A[i+1]-A[i])*diff < 0 ) {
                return false;
            }
            diff = A[i+1] - A[i];
        }
        return true;
    }
}
