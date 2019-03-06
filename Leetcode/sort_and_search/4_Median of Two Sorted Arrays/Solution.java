class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res = 0;
        int len = nums1.length + nums2.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(len/2+1);
        for(int i = 0; i<nums1.length; i++){
            if(queue.size()<len/2+1)  queue.add(nums1[i]);
            else if(nums1[i]>queue.peek()){
                queue.remove(); queue.add(nums1[i]);
            }
        }
        for(int i = 0; i<nums2.length; i++){
            if(queue.size()<len/2+1)  queue.add(nums2[i]);
            else if(nums2[i]>queue.peek()){
                queue.remove(); queue.add(nums2[i]);
            }
        }
        if(len%2==0){
            return (double)(queue.poll()+queue.poll())/2;
        }
        return (double)queue.poll();
    }
    /* The solution from the smartass in the discuss session */
    /*/
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
    }

        public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
            if (aStart > A.length - 1) return B[bStart + k - 1];
            if (bStart > B.length - 1) return A[aStart + k - 1];
            if (k == 1) return Math.min(A[aStart], B[bStart]);

            int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
            if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1];
            if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];

            if (aMid < bMid)
                return getkth(A, aStart + k/2, B, bStart,       k - k/2);// Check: aRight + bLeft
            else
                return getkth(A, aStart,       B, bStart + k/2, k - k/2);// Check: bRight + aLeft
        }/*/
}
