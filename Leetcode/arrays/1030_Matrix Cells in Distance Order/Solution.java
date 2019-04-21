class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R*C][2];
        int k = 0;
        for(int i = 0; i<R; i++){
            for(int j=0; j<C; j++){
                res[k][0] = i;
                res[k][1] = j;
                k++;
            }
        }
        java.util.Arrays.sort(res, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                 return Integer.compare(distance(a, r0, c0), distance(b, r0, c0));
            }
        });
        return res;
    }
        private int distance(int[] a, int r0, int c0){
            return Math.abs(a[0]-r0) + Math.abs(a[1]-c0);
        }
}
