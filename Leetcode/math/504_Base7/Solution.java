class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder res = new StringBuilder();
        char sign = '+';
        if(num<0){
            sign = '-';
            num *= -1;
        }
        while(num>0){
            res.append(num%7);
            num /= 7;
        }
        if(sign=='-') res.append(sign);
        return res.reverse().toString();
    }
}
