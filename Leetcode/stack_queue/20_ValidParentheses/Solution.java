class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); ++i){
            Character ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else if(!stack.empty() && checkParentheses(stack.peek(), ch)){
                stack.pop();
            }else{
                return false;
            }
        }
        return (stack.empty())? true: false;
    }
        private boolean checkParentheses(Character c1, Character c2){
            return (c1=='(' && c2==')' ) || (c1=='{' && c2=='}') || (c1=='[' && c2==']');
        }
}
