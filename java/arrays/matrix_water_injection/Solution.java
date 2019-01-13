public class Solution {
    /**
     * @param matrix: the height matrix
     * @param R: the row of (R,C)
     * @param C: the columns of (R,C)
     * @return: Whether the water can flow outside
     */
    class Point{
        public int x;
        public int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    int dir[][]={{1,0}, {-1,0}, {0,1}, {0,-1}};

    public String waterInjection(int[][] matrix, int R, int C) {
        // Write your code here
        int[][] path = new int[matrix.length][matrix[0].length];
        Queue<Point> q = new LinkedList<Point>();
        q.offer(new Point(R, C));
        path[R][C]=1;
        while(!q.isEmpty()){
            Point temp = q.poll();
            if (temp.x==0||temp.y==0|temp.x==matrix.length-1||temp.y==matrix[0].length-1)
                return "YES";
            for (int i = 0; i<4; i++){
                int tx = temp.x + dir[i][0];
                int ty = temp.y + dir[i][1];
                if (tx < 0 || tx>=matrix.length || ty<0 || ty>=matrix[0].length){
                    continue;
                }
                if(matrix[tx][ty] < matrix[temp.x][temp.y]
                    && path[tx][ty]==0){
                    q.offer(new Point(tx, ty));
                    path[tx][ty] = 1;
                }
            }
        }
        return "NO";
    }
}
