class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A==null || A.length==0 )
            return new int[0][0];
        int row = A.length;
        int col = A[0].length;
        int[][] B = new int[row][col];
        for (int i=0; i<col; i++){
            for (int j=0; j<row; j++){
                B[i][row-1-j] = 1 - A[i][j];
            }
        }
        return B;
    }
}