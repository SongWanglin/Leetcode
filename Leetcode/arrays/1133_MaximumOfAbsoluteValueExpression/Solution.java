class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length, res = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int res1 = Math.abs(arr1[i]-arr1[j])
                    +Math.abs(arr2[i]-arr2[j])+Math.abs(i-j);
                res = Math.max(res, res1);
            }
        }
        return res;
    }
}
