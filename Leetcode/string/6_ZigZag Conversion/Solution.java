/*
    0               2n-2
    1         2n-3  2n-1
    ...   ...       ...
    n-2 n           3n-4
    n-1             3n-3

    1 每一个Z字的首字母差,numRows*2-2位置
    2 除了首尾两行,每个Z字有两个字母,索引号关系为,一个为i,另一个为numsRows*2-2-i
*/
class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        // String buffer array
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0; i<sb.length; i++)
            sb[i] = new StringBuffer();
        int i = 0;
        int len = c.length;
        while( i<len ){
            for(int idx = 0; idx < numRows && i<len; idx++){
                sb[idx].append(c[i]); i++;
            }
            for(int idx = numRows - 2; idx >= 1 && i<len; idx--){
                sb[idx].append(c[i]); i++;
            }
        }
        // put strings together
        for(int idx = 1; idx < numRows; idx++){
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();
    }
}
