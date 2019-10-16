class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length-1, mid = -1;
        if(nums.length==0) return new int[]{-1, -1};
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]==target)
                break;
            if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        if(nums[mid]!=target) return new int[]{-1, -1};
        int[] res = new int[]{mid, mid};
        while(res[0]>0 && nums[res[0]]==nums[res[0]-1]){res[0]--;}
        while(res[1]<nums.length-1 && nums[res[1]]==nums[res[1]+1]){res[1]++;}
        return res;
    }
}
