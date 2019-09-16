class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> history = new ArrayList<>();
        for(String op: ops){
            if(op.equals("C")){
                history.remove(history.size()-1);
            }else if(op.equals("D")){
                history.add(history.get(history.size()-1)*2);
            }else if(op.equals("+")){
                history.add( history.get(history.size()-1)+history.get(history.size()-2) );
            }else{
                history.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int num: history){
            sum += num;
        }
        return sum;
    }
}
