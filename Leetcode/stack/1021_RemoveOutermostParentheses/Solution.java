class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder stack = new StringBuilder();
        int count = 0, leftmost = 0;
        for(Character c: S.toCharArray()){
            count += (c=='(')? 1: -1;
            stack.append(c);
            if(count==0){
                stack.deleteCharAt(leftmost);
                stack.setLength(stack.length() - 1);
                leftmost = stack.length();
            }
        }
        return stack.toString();
    }
}
