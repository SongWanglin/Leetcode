class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length, res = 0;
        int[] order_height = new int[n];
        for(int i=0; i<n; i++){
            order_height[i] = heights[i];
        }
        Arrays.sort(order_height);
        for(int i=0; i<n; i++){
            if(order_height[i] == heights[i]){
                continue;
            }
            res++;
        }
        return res;
    }
}
