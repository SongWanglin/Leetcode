class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length(), bLen = b.length();
        if(bLen==0)
            return a;
        if(aLen==0)
            return b;
        if(a.charAt(aLen-1)=='1' && b.charAt(bLen-1)=='1'){
            return addBinary(addBinary(a.substring(0, aLen-1), b.substring(0, bLen-1)), "1")+"0";
        }else if(a.charAt(aLen-1)=='0' && b.charAt(bLen-1)=='0'){
            return addBinary(a.substring(0, aLen-1), b.substring(0, bLen-1))+"0";
        }else{
            return addBinary(a.substring(0, aLen-1), b.substring(0, bLen-1))+"1";
        }
    }
}
