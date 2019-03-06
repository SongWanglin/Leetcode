class MinStack {
    private Stack<Integer> stk = new Stack<>();
    private int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if(x <= min){
            stk.push(min);
            min = x;
        }
        stk.push(x);
    }
    // stk: ...| previous min | current min |...
    public void pop() {
        if(stk.pop() == min){
            min = stk.pop();
        }
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
