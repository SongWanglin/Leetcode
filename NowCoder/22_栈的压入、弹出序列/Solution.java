import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> helper = new Stack<>();
        int pop_index = 0;
        for(int i = 0; i<pushA.length; i++){
            helper.push(pushA[i]);
            if(pushA[i] == popA[pop_index]){
                helper.pop();
                pop_index++;
            }
        }
        while(!helper.isEmpty()){
            if(helper.pop()!=popA[pop_index]){
                return false;
            }
            pop_index++;
        }
        return true;
    }
}
