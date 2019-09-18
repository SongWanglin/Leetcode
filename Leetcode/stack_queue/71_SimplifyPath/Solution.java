class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String s: paths){
            if(s.equals("..")){
                if(!stack.empty() )
                    stack.pop();
            }
            else if(s.equals(".") || s.length()==0){
                continue;
            }else{
                stack.push(s);
            }
        }
        String res = "";
        while(!stack.empty()) res = "/"+stack.pop()+res;
        return (res.length()==0)?"/":res;
    }
}
