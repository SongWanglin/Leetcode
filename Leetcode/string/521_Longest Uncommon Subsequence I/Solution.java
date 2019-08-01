class Solution {
    public int findLUSlength(String a, String b) {
        /*/String s = "ab";
        System.out.println(a.contains(s));/*/
        // One line
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
        /*/
        int res = -1;
        if(a.length()==0 && b.length()==0)
            return res;
        int length = a.length();
        for(int len = 1; len<= length; len++){
            for(int i = 0; i+len-1<length; i++){
                String temp = a.substring(i, i+len);
                if(!b.contains(temp))
                    res = Math.max(res, len);
            }
        }
        for(int len = 1; len<=b.length(); len++){
            for(int i = 0; i+len-1<b.length(); i++){
                String temp = b.substring(i, i+len);
                if(!a.contains(temp))
                    res = Math.max(res, len);
            }
        }
        return res;/*/
    }
}
