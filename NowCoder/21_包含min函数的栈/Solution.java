import java.util.Stack;

public class Solution {
    private int minimum = Integer.MAX_VALUE;
    private Stack<Integer> stk = new Stack<>();

    public void push(int node) {
        if(node <= minimum){
            stk.push(minimum);
            minimum = node;
        }
        stk.push(node);
        return;
    }

    public void pop() {
        if(stk.pop() == minimum){
            minimum = stk.pop();
        }
        return;
    }

    public int top() {
        return stk.peek();
    }

    public int min() {
        return minimum;
    }
}
