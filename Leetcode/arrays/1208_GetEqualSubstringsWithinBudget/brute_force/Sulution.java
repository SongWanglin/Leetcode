class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] wordDiff = new int[s.length()];
        for(int i = 0; i<wordDiff.length; ++i){
            wordDiff[i] = Math.abs( (int)(s.charAt(i) - t.charAt(i)) );
        }
        int maxLen = 0;
        for(int i = 0; i<wordDiff.length-1; ++i){
            int length = 0, sum = 0;
            for(int j = i; j<wordDiff.length; ++j){
                sum += wordDiff[j];
                if(sum>maxCost)
                    break;
                length += 1;
                maxLen = Math.max(maxLen, length);
            }
        }
        return maxLen;
    }
}
