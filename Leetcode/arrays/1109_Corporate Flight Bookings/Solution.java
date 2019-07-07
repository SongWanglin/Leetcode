class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for(int nums[]: bookings){
            for(int i = nums[0]-1; i<nums[1]; i++)
                res[i] += nums[2];
        }
        return res;
    }
}
