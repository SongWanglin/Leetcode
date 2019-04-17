class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] numsCopy = nums.clone();
        Arrays.sort(numsCopy);
        int start = numsCopy.length, end = 0;
        for(int i = 0; i<numsCopy.length; i++){
            if(numsCopy[i]==nums[i]){
                continue;
            }
            start = Math.min(start, i);
            end = Math.max(end, i);
        }
        return (end-start>=0)? end-start+1: 0;
    }
}
