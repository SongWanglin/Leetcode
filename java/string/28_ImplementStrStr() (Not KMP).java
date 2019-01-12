class Solution {
    public int strStr(String source, String target) {
        /* Native solution */
        char[] chs = source.toCharArray();
        char[] chsTarget = target.toCharArray();
        boolean find = true;
        for (int i =0; i<chs.length-chsTarget.length+1; i++){
            for (int j = 0; j<chsTarget.length; j++){
                if (chs[i+j]!=chsTarget[j]){
                    find = false;
                    break;
                }
            }
            if (find==true)
                return i;
            find = true;
        }
        return -1;
    }
}
