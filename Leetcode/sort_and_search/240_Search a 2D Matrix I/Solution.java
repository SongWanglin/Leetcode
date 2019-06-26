class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int colStart = 0, rolEnd = matrix[0].length-1;
        int propose = matrix[colStart][rolEnd];
        while (colStart<matrix.length && rolEnd>=0 && propose!=target){
            propose = matrix[colStart][rolEnd];
            if (propose < target){
                colStart++;
            } else{
                rolEnd--;
            }
        }
        return propose == target;
    }
}
