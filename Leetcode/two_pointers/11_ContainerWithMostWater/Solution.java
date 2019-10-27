class Solution {
    public int maxArea(int[] height) {
        int res = Integer.MIN_VALUE;
        int left = 0, right = height.length-1;
        while(left<right){
            int h = Math.min(height[left], height[right]);
            res = Math.max(res, (right-left)*h);
            while(height[left]<=h && left<right) left++;
            while(height[right]<=h && left<right) right--;
        }
        return res;
    }
}
