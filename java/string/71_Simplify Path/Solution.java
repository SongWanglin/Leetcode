class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        HashSet<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        for (String dir: path.split("/")){
            if(dir.equals("..") && !stk.isEmpty()) stk.pop();
            else if(!skip.contains(dir)) stk.push(dir);
        }
        String res = "";
        if(stk.isEmpty()) return "/";
        while(!stk.isEmpty()){
            res="/"+stk.pop()+res;
        }
        return res;
    }
}
