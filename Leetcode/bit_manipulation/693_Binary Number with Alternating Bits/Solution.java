class Solution {
    public boolean hasAlternatingBits(int n) {
        /*/
        StringBuilder res = new StringBuilder();
        while(n>0){
            int tmp = n%2;
            n /= 2;
            res.append(tmp);
        }
        String s = res.reverse().toString();
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i-1)==s.charAt(i))
                return false;
        }
        return true;/*/
        long k = n % 2 == 0 ? 2:1;
        int j = 1;
        long tmp = k;
        while(k < n)
            k += tmp << 2 * j++;
        return k == n;
    }
}
