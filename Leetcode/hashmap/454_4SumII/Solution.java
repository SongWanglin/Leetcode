class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, res = 0;
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<B.length; j++){
                sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        for(int i = 0; i<C.length; i++){
            for(int j = 0; j<D.length; j++){
                res += map.getOrDefault(-C[i]-D[j], 0);
            }
        }
        return res;
    }
}
