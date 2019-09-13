class Solution {
    public int[] sortArrayByParityII(int[] A) {
        if(A.length==0)
            return A;
        int odd = 1, even = 0, n = A.length;
        while (even < n && odd < n) {
            while (even < n && A[even] % 2 == 0) {
                even += 2;
            }
            while (odd < n && A[odd] % 2 == 1) {
                odd += 2;
            }
            if (even < n && odd < n)
                swap(A, even, odd);
        }
        return A;
    }
        private void swap(int[] A, int i, int j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
}
