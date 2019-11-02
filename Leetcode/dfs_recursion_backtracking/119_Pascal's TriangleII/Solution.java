class Solution {
    public List<Integer> getRow(int rowIndex) {
        LinkedList<Integer> last = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        res.add(1);
        for(int i = 1; i<=rowIndex; ++i){
            last = res;
            res = new LinkedList<Integer>();
            res.add(1);
            for(int j = 0; j<last.size()-1; ++j){
                res.add(last.get(j)+last.get(j+1));
            }
            res.add(1);
        }
        return res;
    }
}
