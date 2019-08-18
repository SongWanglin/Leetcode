class Solution {
    public String lastSubstring(String s) {
        int largestChar = s.charAt(0);
        boolean allSame = true;
        for(char c: s.toCharArray()){
            if(c!=largestChar)
                allSame = false;
            largestChar = Math.max(largestChar, c);
        }
        if(allSame) return s;
        String res = "";
        for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)==largestChar && s.substring(i).compareTo(res)>0)
                    res = s.substring(i);
            }
        return res;
    }
}
