class Solution {
    public int trap(int[] height) {
        int res = 0, maxLeft, maxRight, minBucket;
        for(int i = 1; i<height.length-1; i++){
            maxLeft = 0;
            for(int k = i-1; k>=0; k--){
                maxLeft = (height[k]>maxLeft)? height[k]: maxLeft;
            }
            maxRight = 0;
            for(int k = i+1; k<height.length; k++){
                maxRight = (height[k]>maxRight)? height[k]: maxRight;
            }
            minBucket = Math.min(maxLeft, maxRight);
            res += Math.max(0, minBucket - height[i]);
        }
        return res;
    }
}



