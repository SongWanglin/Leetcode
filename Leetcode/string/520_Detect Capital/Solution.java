class Solution {
    public boolean detectCapitalUse(String word) {
        if(word==null || word.isEmpty()) return false;
        boolean res = Character.isUpperCase( word.charAt(0) ),
                res2 = !res, res3 = res;
        for(int i = 1; i<word.length(); i++){
            res3 &= Character.isLowerCase( word.charAt(i) );
            res2 &= Character.isLowerCase( word.charAt(i) );
            res &= Character.isUpperCase( word.charAt(i) );
        }
        return res || res2 || res3;
    }
}
