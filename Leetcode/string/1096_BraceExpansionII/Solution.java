class Solution {
    public List<String> braceExpansionII(String expression) {
        String s = expression;
        char preSign = ',';
        Stack<List<String>> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            // {...} recursive, stack.operate(resList) by preSign
            if(c=='{'){
                int j = i, p = 1;
                while(s.charAt(j)!='}' || p!=0){
                    j++;
                    if(s.charAt(j)=='{') p++;
                    if(s.charAt(j)=='}') p--;
                }
                List<String> slist = braceExpansionII(s.substring(i+1, j));
                if(preSign=='*'){
                    stack.push(merge(stack.pop(), slist));
                }
                else stack.push(slist);
                i = j;
                preSign = '*';
            }
            // letter operate by preSign
            else if(Character.isLetter(c)){
                List<String> slist = new ArrayList<>();
                slist.add(""+c);
                if(preSign == '*'){
                    stack.push(merge(stack.pop(), slist));
                }
                else stack.push(slist);
                preSign = '*';
            }
            // if ==', ', preSign is plus
            if(c==',' || i==s.length()-1){
                preSign = ',';
            }
        }
        List<String> res = new ArrayList<>();
        while(!stack.isEmpty()){
            for(String l: stack.pop())
                if(!res.contains(l)) res.add(l);
        }
        Collections.sort(res);
        return res;
    }
        private List<String> merge(List<String> list1, List<String> list2){
            List<String> res = new ArrayList<>();
            for(String s1: list1){
                for(String s2: list2){
                    res.add(s1+s2);
                }
            }
            return res;
        }
}
