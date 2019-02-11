public class Solution {
    public boolean Find(int target, int [][] array) {
          if(array.length==0){
              return false;
          }
          return Search(target, array, 0, array[0].length-1);
    }
        private boolean Search(int target, int[][] array,
                               int row, int col){
            if(col>=0 && row<=array.length-1){
                if(array[row][col] == target){
                    return true;
                }else if(array[row][col]>target){
                    return Search(target, array, row, col-1);
                }else{
                    return Search(target, array, row+1, col);
                }
            }
            return false;
        }
}
