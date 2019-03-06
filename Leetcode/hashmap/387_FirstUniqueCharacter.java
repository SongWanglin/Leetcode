class Solution {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        char[] s2 = s.toCharArray();
        for (int i=0; i<s2.length; i++){
            chars[(int)(s2[i]-'a')] +=1;
        }
        for (int i=0; i<s2.length; i++){
            if(chars[(int)(s2[i]-'a')] == 1) {return i;}
        }
        return -1;
    }
}
