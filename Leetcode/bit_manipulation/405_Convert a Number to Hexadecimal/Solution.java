class Solution {
    public String toHex(int num) {
        char[] mapTable = new char[] {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        StringBuilder res = new StringBuilder();
        if(num==0) return "0";
        if(num<0) {
            num = ~num;
            for (int i = 0; i < 8; i++) {
                res.append(mapTable[15 - num % 16]);
                num /= 16;
            }
            return res.reverse().toString();
        }
        while(num>0){
            char tmp = mapTable[num%16];
            System.out.println(tmp);
            res.append( tmp);
            num /= 16;
        }
        return res.reverse().toString();
    }
}
