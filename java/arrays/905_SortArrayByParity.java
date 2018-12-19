class Solution {
    public int[] sortArrayByParity(int[] A) {
        int L = A.length;
        int i = 0, j = L-1;
        int result[] = new int[L];
        for (int k=0; k<A.length; k++){
            if(A[k]%2==0){
                result[i] = A[k]; i++;
            }else{
                result[j] = A[k]; j--;
            }
        }
        return result;
    }
}