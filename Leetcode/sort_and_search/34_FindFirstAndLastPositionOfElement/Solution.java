class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length, start = 0, end = n, mid;
        int[] res = new int[2];
        if(nums.length==0){
            return new int[]{-1, -1};
        }
        do{
            mid = (start+end)/2;
            if(nums[mid]==target) break;
            if( nums[mid]>target ){
                end = mid;
            } else{
                start = mid+1;
            }
        }while( start < end );
        res[0] = (nums[mid]!=target)?-1:mid;
        res[1] = (nums[mid]!=target)?-1:mid;
        do {
            if(res[0]==0 || res[0]== -1) break;
            if(nums[res[0]]!=nums[res[0]-1]) break;
            res[0]--;
        }while( nums[res[0]]==nums[res[0]+1] );
        do {
            if(res[1]==nums.length-1 || res[1]==-1) break;
            if(nums[res[1]]!=nums[res[1]+1]) break;
            res[1]++;
        }while( nums[res[1]]==nums[res[1]-1] );
        return res;
    }
}
