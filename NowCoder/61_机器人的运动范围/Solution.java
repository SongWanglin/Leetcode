public class Solution {
    public int movingCount(int threshold, int rows, int cols){
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                visited[i][j] = false;
            }
        }
        return move(threshold, rows, cols,0, 0, visited);
    }
        private int move(int threshold, int rows, int cols,
                            int i, int j, boolean[][] map){
            int res = 0;
            if(!valid_Move(threshold, rows, cols, i, j) ){
                return res;
            }
            if(!map[i][j]){
                map[i][j] = true;
                res = 1+move(threshold, rows, cols, i-1, j, map)
                       +move(threshold, rows, cols, i+1, j, map)
                       +move(threshold, rows, cols, i, j-1, map)
                       +move(threshold, rows, cols, i, j+1, map);
            }
            return res;
        }
        private boolean valid_Move(int threshold, int rows, int cols,
                            int i, int j){
            int i_digit = countDigit(i);
            int j_digit = countDigit(j);
            return (i>=0)&&(j>=0)&&(i<rows)&&(j<cols)
                &&(i_digit+j_digit<=threshold);
        }
        private int countDigit(int n){
            if(n<=0){
                return 0;
            }
            return n%10+countDigit(n/10);
        }
}
