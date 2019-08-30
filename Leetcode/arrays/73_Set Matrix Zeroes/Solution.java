class Solution {
    public void setZeroes(int[][] matrix) {
        if( matrix.length==0 || matrix[0].length==0)
            return;
        boolean rowIsZero = false, columnIsZero = false;
        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    if(i==0) columnIsZero = true;
                    if(j==0) rowIsZero = true;
                    matrix[i][0]=0; matrix[0][j]=0;
                }
            }
        }
        for(int i = 1; i<matrix.length; i++){
            for(int j = 1; j<matrix[0].length; j++){
                if( matrix[i][0]==0 || matrix[0][j]==0 )
                    matrix[i][j]=0;
            }
        }
        if(rowIsZero){
            for(int i = 0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        if(columnIsZero){
            for(int j = 0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
    }
}
