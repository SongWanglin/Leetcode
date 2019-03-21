//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length<2){
            return;
        }
        int resXOR = array[0];
        for(int i = 1; i<array.length; i++){
            resXOR ^= array[i];
        }
        int indexOf1 = findFirstbit(resXOR);
        for(int num: array){
            if(isBit(num, indexOf1)){
                num1[0] ^= num;
            } else{
                num2[0] ^= num;
            }
        }
    }

        private int findFirstbit(int bit) {
            int indexBit = 0;
            while (((bit & 1) == 0) && indexBit < 32) {
                indexBit++;
                bit = bit >> 1;
            }
            return indexBit;
        }

        private boolean isBit(int array, int indexBit) {
            return ((array >> indexBit) & 1) == 1;
        }
}
