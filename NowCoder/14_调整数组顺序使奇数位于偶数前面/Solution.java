public class Solution {
    public void reOrderArray(int [] array) {
        int len = array.length;
        if (len <2){
            return;
        }
        for(int j = 0; j<len; j++){
            for (int i = len-1; i>j; i--){
                if(array[i]%2!=0 && array[i-1]%2==0){
                    int tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                }
            }
        }
    }
}
