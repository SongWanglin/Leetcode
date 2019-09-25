class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for(int num: nums1){
            if(!set.contains(num) && bisect(nums2, num)!=-1){
                set.add(num);
            }
        }
        int[] res = new int[set.size()];
        int k = 0;
        for(int num: set)
            res[k++] = num;
        return res;
    }
    private int bisect(int[] nums, int target){
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
