class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = {"+","-","*","/"};
        Set<String> ops = new HashSet<>(Arrays.asList(arr));
        for(String token: tokens){
            if(!ops.contains(token)){
                stack.push(Integer.parseInt(token));
            }else{
                int num2 = stack.pop(), num1 = stack.pop();
                if(token.equals("+")){
                    stack.push(num1+num2);
                }else if(token.equals("-")){
                    stack.push(num1-num2);
                }else if(token.equals("*")){
                    stack.push(num1*num2);
                }else{
                    stack.push(num1/num2);
                }
            }
        }
        return stack.peek();
    }
}
