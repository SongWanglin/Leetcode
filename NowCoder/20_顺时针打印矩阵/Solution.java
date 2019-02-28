import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       ArrayList<Integer> res = new ArrayList<>();
       int i_start = 0, i_end = matrix.length-1,
           j_start = 0, j_end = matrix[0].length-1;
       int count = 0;
       while(i_start<=i_end && j_start<=j_end){
           switch(count%4){
               case 0:
                   for(int j = j_start; j <= j_end; j++){
                       res.add(matrix[i_start][j]);
                   }
                   i_start++;
                   break;
               case 1:
                   for(int i = i_start; i <= i_end; i++){
                       res.add(matrix[i][j_end]);
                   }
                   j_end--;
                   break;
               case 2:
                   for(int j = j_end; j >= j_start; j--){
                       res.add(matrix[i_end][j]);
                   }
                   i_end--;
                   break;
               case 3:
                   for(int i = i_end; i >= i_start; i--){
                       res.add(matrix[i][j_start]);
                   }
                   j_start++;
                   break;
               default:
                   break;
           }
           count++;
       }
       return res;
    }
}
