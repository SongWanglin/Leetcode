class Solution {
    public boolean validMountainArray(int[] A) {
        int len = A.length, i = 0, j = len-1;
        while(i+1<len && A[i]<A[i+1]) i++;
        while(j>0 && A[j-1]>A[j]) j--;
        return i>0 && j<len-1 && i==j;
    }
}
