/*/
e.g.1
000     110
001 ->  111 <- all ones
110     000 <- all zeros
        ^^
        flip columns
e.g.2
00111       11111 <- all ones
11000       00000 <- all zeros
10101  ->   01101
10100       01100
00111       11111 <- all ones
            ^^
            flip columns
now we look closer, actually row0, row1 and row4 have the same pattern originally
row0 = 00111
row1 = 11000
row4 = 00111
so we can just flip the rows count the pattern occurrence instead of brainlessly flipping the columns
/*/
class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();
        for(int[] row : matrix){
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int r : row){
                sb1.append(r);
                sb2.append(1-r);
            }
            String str1 = sb1.toString();
            String str2 = sb2.toString();
            map.put(str1, map.getOrDefault(str1, 0)+1);
            map.put(str2, map.getOrDefault(str2, 0)+1);
        }
        int res = 0;
        for(int v: map.values()){
            res = Math.max(res, v);
        }
        return res;
    }
}
