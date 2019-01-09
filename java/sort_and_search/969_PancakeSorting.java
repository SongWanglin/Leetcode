class Solution {
    /* solution given by greedy algorithm, not optimal */
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> res = new ArrayList<Integer>();
        res = sort(A, A.length, res);
        return res;
    }
        private List<Integer> sort(int[] A, int height, List<Integer> res){
            if (height == 1)
                return res;
            int maxIdx = findMaxIndex(A, height);
            if(height != maxIdx){
                if(maxIdx!=1){
                    flip(A, maxIdx);
                    res.add(maxIdx);
                }
                flip(A, height);
                res.add(height);
            }
            return sort(A, height-1, res);
        }
        private void flip(int[] A, int index){
            for (int i=0; i<index/2; i++){
                int tmp = A[index-1-i];
                A[index-1-i] = A[i]; A[i] = tmp;
            }
        }
        private int findMaxIndex(int[] A, int index){
            int max = Integer.MIN_VALUE, maxIdx = 0;
            for (int i=0; i<index; i++){
               if (A[i] > max){
                   max = A[i]; maxIdx = i+1;
               }
            }
            return maxIdx;
        }
}
