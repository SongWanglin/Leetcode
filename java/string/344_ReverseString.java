class Solution {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int l = arr.length;
        for (int i = 0; i<l/2 ; i++){
            arr[i] = (char)((int)arr[i] +(int)arr[l-1-i]);
            arr[l-1-i] = (char)((int)arr[i] -(int)arr[l-1-i]);
            arr[i] = (char)((int)arr[i] -(int)arr[l-1-i]);
        }
        return new String(arr);
    }
}
