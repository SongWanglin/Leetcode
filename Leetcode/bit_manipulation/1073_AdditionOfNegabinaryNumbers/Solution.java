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
/*/ better solution using stack and bit-shifting
class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int i = arr1.length - 1, j = arr2.length - 1, carry = 0;
        Stack<Integer> stack = new Stack<>();
        while (i >= 0 || j >= 0 || carry != 0) {
            int v1 = i >= 0 ? arr1[i--] : 0;
            int v2 = j >= 0 ? arr2[j--] : 0;
            carry = v1 + v2 + carry;
            stack.push(carry & 1);
            carry = -(carry >> 1);
        }
        while (!stack.isEmpty() && stack.peek() == 0) stack.pop();
        int[] res = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            res[index++] = stack.pop();
        }
        return res.length == 0 ? new int[1] : res;
    }
}
/*/
