class Solution {
    public int numSquares(int n) {
        int[] res = {Integer.MAX_VALUE};
        dfs(n, res, (int)Math.sqrt(n), 0);
        return res[0];
    }
    private void dfs(int target, int[] res, int num, int count){
        if(target<0 || count>=res[0])
            return;
        if(target==0){
            res[0] = Math.min(res[0], count);
            return;
        }
        for(int i = num; i>0; --i){
            int square = (int)Math.pow(i, 2);
            if( square>target)
                continue;
            dfs(target-square, res, i, count+1);
        }
    }
}
