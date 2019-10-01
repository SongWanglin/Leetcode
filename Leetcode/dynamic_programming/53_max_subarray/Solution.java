class Solution {
    public int maxSubArray(int[] A) {
        int maxSoFar=Integer.MIN_VALUE, maxEndingHere=0;
        for (int i=0;i<A.length;++i){
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
