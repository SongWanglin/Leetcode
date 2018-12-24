class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int index;
        int res[][] = new int [r][c];
        if (nums.length*nums[0].length!=r*c){
            return nums;
        }
        for (int i=0; i<nums.length; ++i){
            for (int j = 0; j<nums[0].length; ++j){
                index = i*nums[0].length+j;
                res[index/c][index%c] = nums[i][j];
            }
        }   
        return res;
    }
}