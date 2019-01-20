class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix.length==0)
            return res;
        int iStart = 0, iEnd = matrix.length-1,
            jStart = 0, jEnd = matrix[0].length-1, count = 0;
        while(iStart<=iEnd && jStart<=jEnd){
            if (count%4==0){
                for (int j = jStart; j<=jEnd; j++){
                    res.add(matrix[iStart][j]);
                }
                iStart++;
            }
            else if (count%4==1){
                for (int i = iStart; i<=iEnd; i++){
                    res.add(matrix[i][jEnd]);
                }
                jEnd--;
            }
            else if (count%4==2){
                for (int j = jEnd; j>=jStart; j--){
                    res.add(matrix[iEnd][j]);
                }
                iEnd--;
            } else{
                for (int i = iEnd; i>=iStart; i--){
                    res.add(matrix[i][jStart]);
                }
                jStart++;
            }
            count ++;
        }
        return res;
    }
}
