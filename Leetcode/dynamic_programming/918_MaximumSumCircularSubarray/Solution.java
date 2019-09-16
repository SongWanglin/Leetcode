class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSoFar = A[0], maxEndingHere = 0,
            minSoFar = A[0], minEndingHere = 0;
        for(int num: A){
            total += num;
            maxEndingHere = Math.max(num, maxEndingHere+num);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            minEndingHere = Math.min(num, minEndingHere+num);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        return (maxSoFar<0)? maxSoFar: Math.max(maxSoFar, total-minSoFar);
    }
}
