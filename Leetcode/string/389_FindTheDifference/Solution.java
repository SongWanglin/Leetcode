class Solution {
    public char findTheDifference(String s, String t) {
        int[] res = new int[26];
        Character ch = 'A';
        for(Character c: t.toCharArray()){
            res[c-'a'] += 1;
        }
        for(Character c: s.toCharArray()){
            res[c-'a'] -= 1;
        }
        for(int i = 0; i<26; i++){
            if(res[i]!=0)
                ch = (char)('a'+i);
        }
        return ch;
    }
}
