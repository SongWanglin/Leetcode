class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, res = (n+1)*n/2;
        for (int i = 0; i<nums.length; i++){
            res -= nums[i];
        }
        return res;
    }
}

/* Bit Manipulation */
/*/
class Solution {
    public int missingNumber(int[] nums) {
    int res = nums.length;
    for(int i=0; i<nums.length; i++){
        res ^= i;
        res ^= nums[i];
    }
    return res;
    }
}/*/
