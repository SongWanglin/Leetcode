public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0], sum = array[0];
        for (int i = 1; i<array.length; i++){
            sum+=array[i];
            max = (sum > max)?sum: max;
            sum = (sum<0)? 0: sum;
        }
        return max;
    }
}
