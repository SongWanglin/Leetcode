class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0)
            return false;
        int n = matrix[0].length;
        return twoDBisect(matrix, 0, n-1, target);
    }
    private boolean twoDBisect(int[][] matrix, int m, int n, int target){
        if(m==matrix.length || n==-1)
            return false;
        int mid = matrix[m][n];
        return (mid==target)? true: (mid<target)? twoDBisect(matrix, m+1, n, target): twoDBisect(matrix, m, n-1, target);
    }
}
