class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int[] dp = new int[triangle.size()+1];
        for(int i = triangle.size()-1; i>=0; i--){
            for(int j = 0; j<=i; j++){
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];/*/
        // similar but without extra space
        int len = triangle.size();
        for(int i=len-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j),
                    triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);/*/
    }
}
