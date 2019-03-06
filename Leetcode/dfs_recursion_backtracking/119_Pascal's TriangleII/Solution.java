class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i<=rowIndex; i++){
            res = newRow(i, res);
        }
        return (List)res;
    }
        private ArrayList<Integer> newRow (int rowIndex, ArrayList<Integer> pre){
            ArrayList<Integer> res = new ArrayList<Integer>();
            res.add(1);
            if(rowIndex == 0){
                return res;
            }
            for (int i = 1; i<rowIndex; i++){
                res.add( pre.get(i-1)+pre.get(i) );
            }
            res.add(1);
            return res;
        }
    /* first attempt with simple recursion (time out) */
    /*/
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i<=rowIndex; i++){
            res.add(getValue(i, rowIndex));
        }
        return res;
    }
        private int getValue(int colIndex, int rowIndex){
            if(rowIndex == 0 || rowIndex == 1){
                return 1;
            }
            if(colIndex == 0 || colIndex == rowIndex){
                return 1;
            }
            return getValue(colIndex-1, rowIndex-1) + getValue(colIndex, rowIndex-1);
        }
        /*/
}
