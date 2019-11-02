class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)
            return new LinkedList<List<Integer>>();
        List<List<Integer>> res = generate(numRows-1);
        LinkedList<Integer> temp = new LinkedList<>();
        temp.add(1);
        if(numRows==1){
            res.add(temp);
        }else{
            List<Integer> last = res.get(res.size()-1);
            for(int i = 0; i<last.size()-1; ++i){
                temp.add(last.get(i)+last.get(i+1));
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}
