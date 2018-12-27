class Solution {
    public int[] diStringMatch(String S) {
        int l = S.length(), num1 = 0, num2 = l;
        char[] s1 = S.toCharArray();
        int[] res = new int[l+1];
        for (int i = 0; i <l; i++){
            res[i] = (s1[i] == 'I')? num1++: num2--;
        }
        res[l] = num2--;
        return res;
    }
}
