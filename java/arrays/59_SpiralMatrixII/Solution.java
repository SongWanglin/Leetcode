class Solution {
    public int[][] generateMatrix(int n) {
       int[][] matrix = new int[n][n];
        if (n==0)
            return matrix;
        int iStart = 0, iEnd = n-1,
            jStart = 0, jEnd = n-1,
            count = 0, num = 1;
        while(iStart<=iEnd && jStart<=jEnd){
            if (count%4==0){
                for (int j = jStart; j<=jEnd; j++){
                    matrix[iStart][j] = num;
                    num++;
                }
                iStart++;
            }
            else if (count%4==1){
                for (int i = iStart; i<=iEnd; i++){
                    matrix[i][jEnd] = num;
                    num++;
                }
                jEnd--;
            }
            else if (count%4==2){
                for (int j = jEnd; j>=jStart; j--){
                    matrix[iEnd][j] =num;
                    num++;
                }
                iEnd--;
            } else{
                for (int i = iEnd; i>=iStart; i--){
                    matrix[i][jStart]=num;
                    num++;
                }
                jStart++;
            }
            count ++;
        }
        return matrix;
    }
}
