class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i1 = 0;
        for(int i2 = 0; i2<arr2.length; i2++){
            for(int j = 0; j<arr1.length; j++){
                if(arr1[j]==arr2[i2]){
                    int tmp = arr1[j];
                    arr1[j] = arr1[i1];
                    arr1[i1] = tmp;
                    i1++;
                }
            }
        }
        for(int i = arr1.length - 1; i1 < i; i--){
            for(int j = i1; j<i; j++){
                if(arr1[j] > arr1[j+1]){
                    int tmp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = tmp;
                }
            }
        }
        return arr1;
    }
}
