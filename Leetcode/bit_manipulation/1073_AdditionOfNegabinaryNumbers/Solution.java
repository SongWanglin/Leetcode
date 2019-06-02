class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        List<Integer> list = new LinkedList<Integer>();
        int length = 0, len1 = arr1.length, len2 = arr2.length,
            carry = 0, sum = 0, bit = 0, digit1 = 1, digit2 = 1;
        for(int i = 0; i<len1 || i<len2; i++){
            digit1 = (length<len1)? arr1[len1-1-length]: 0;
            digit2 = (length<len2)? arr2[len2-1-length]: 0;
            sum = digit1+digit2+carry;
            carry = (sum < 0)? 1: (sum>1)? -1: 0;
            bit = (sum%2==0)? 0: 1;
            list.add(bit);
            length++;
        }
        while(carry!=0){
            sum = carry;
            carry = (sum < 0)? 1: (sum>1)? -1: 0;
            bit = (sum%2==0)? 0: 1;
            list.add(bit);
            length++;
        }
        int leadingZeros = 0;
        for(int i = 0; i<length; i++){
            if(list.get(length-1-i)!=0){
                break;
            }
            leadingZeros++;
        }
        int[] arr = new int[length-leadingZeros];
        boolean allZero = true;
        for(int i = 0; i<length-leadingZeros; i++){
            arr[i] = list.get(length-leadingZeros-1-i);
        }
        return (length-leadingZeros==0 )? new int[1]: arr;
    }
}
