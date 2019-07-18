class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if( (m==0 && n==0)||ops.length == 0 )
            return m * n;
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for(int i = 0; i<ops.length; i++){
            a = Math.min(a, ops[i][0]);
            b = Math.min(b, ops[i][1]);
        }
        return a * b;
    }
}
