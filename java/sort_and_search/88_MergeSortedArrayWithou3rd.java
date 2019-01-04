class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length-1;
        while (m>0 && n>0){
            if (nums1[m-1]>=nums2[n-1]){
                nums1[l] = nums1[m-1]; nums1[m-1] = 0;
                m--; l--;
            } else{
                nums1[l] = nums2[n-1]; nums2[n-1] = 0;
                n--; l--;
            }
        }
        if (m==0 && n!=0){
            while(n>0){
                nums1[l] = nums2[n-1];
                l--; n--;
            }
        }
        if (n==0 && m!=0){
            while(m>0){
                nums1[l] = nums1[m-1];
                l--; m--;
            }
        }
    }
}
