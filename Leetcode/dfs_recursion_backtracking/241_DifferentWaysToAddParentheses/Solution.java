class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new LinkedList<>();
        int result = 0;
        for(int i = 0; i<input.length(); i++){
            if( input.charAt(i)=='+' || input.charAt(i)=='-'
               || input.charAt(i)=='*'){
                List<Integer> leftRes = diffWaysToCompute(input.substring(0, i));
                List<Integer> rightRes = diffWaysToCompute(input.substring(i+1));
                for(int num1: leftRes){
                    for(int num2: rightRes){
                        result = (input.charAt(i)=='+')? num1+num2:
                                (input.charAt(i)=='-')? num1-num2:
                                (input.charAt(i)=='*')? num1*num2: num1/num2;
                        res.add(result);
                    }
                }
            }
        }
        if(res.size()==0){
           res.add(Integer.valueOf(input));
        }
        return res;
    }
}
/*/


/*/
