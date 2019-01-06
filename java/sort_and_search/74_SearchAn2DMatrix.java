class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int nRol = matrix[0].length, col = 0, rol = 0;
        int start = 0, end = matrix.length*nRol-1, mid = 0;
        while(start <= end){
            mid = start + (end-start)/2;
            col = mid/nRol;
            rol = mid%nRol;
            if (matrix[col][rol]==target){
                return true;
            } else if (matrix[col][rol] > target){
                end = mid - 1;
            } else{
                start = mid +1;
            }
        }
        return false;
    }
}
