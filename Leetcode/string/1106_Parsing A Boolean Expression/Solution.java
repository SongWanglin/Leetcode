class Solution {
    public boolean parseBoolExpr(String expression) {
        if(expression.equals("t")) return true;
        if(expression.equals("f")) return false;
        char[] arr = expression.toCharArray();
        char op = arr[0];
        boolean res = (op!='|');
        int count = 0;
        for(int i = 1, pre = 2; i<arr.length; i++){
            char tmp = arr[i];
            count += (tmp=='(')?1: (tmp==')')?-1: 0;
            if( (tmp==')'&&count==0)||(tmp==',' && count == 1) ){
                boolean next = parseBoolExpr(expression.substring(pre, i));
                pre = i + 1;
                if(op == '|') res |= next;
                else if(op == '&') res &= next;
                else res = !next;
            }
        }
        return res;
    }
}
