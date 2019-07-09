class Solution {
    public int trap(int[] height) {
        /*/
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
        return res;/*/
        /*/ dynamic programming
        int n = height.length, max, res = 0;
        if(n<3) return 0;
        int[] maxLeft = new int[n], maxRight = new int[n];
        max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            max = Math.max(max, height[i]);
            maxLeft[i] = max;
        }
        max = Integer.MIN_VALUE;
        for(int i = n-1; i>=0; i--){
            max = Math.max(max, height[i]);
            maxRight[i] = max;
        }
        for(int i = 0; i<n; i++){
            int diff = Math.min(maxLeft[i], maxRight[i]) - height[i];
            res += (diff>0)? diff: 0;
        }
        return res;/*/
        // stack solution
        int n = height.length;
        if(height==null || n<3 ) return 0;
        //Stack<Integer> stack = new Stack<Integer>();
        int[] stack = new int[n];
        int res = 0, i = 0, top = -1;
        while( i < n ){
            if(top == -1||height[i]<=height[stack[top]]){
                top++;
                stack[top] = i;
                i++; continue;
            }
            int pre = stack[top]; top--;
            if(top!=-1){
                int minHeight = Math.min(height[stack[top]], height[i]);
                res += ( minHeight - height[pre] ) * (i - stack[top] - 1);
            }
        }
        return res;
    }
}

