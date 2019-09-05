class MinStack {
    private Stack<Integer> stack;
    private int minValue = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int x) {
        if(x <= minValue){
            stack.push(minValue);
            minValue = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.isEmpty())
            return;
        if( stack.peek() != minValue){
            stack.pop();
        } else{
            stack.pop();
            minValue = stack.peek();
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValue;
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
