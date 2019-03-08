class Solution {
    public String licenseKeyFormatting(String S, int K) {
        if(S==null || S.isEmpty()){
            return S;
        }
        String raw_input = S.replaceAll("-","").toUpperCase();
        int len = raw_input.length();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<len; i++){
            res.insert(0, raw_input.charAt(len-1-i));
            if( (i+1)%K==0 && i+1!=len){
                res.insert(0, "-");
            }
        }
        return res.toString();
    }
}
