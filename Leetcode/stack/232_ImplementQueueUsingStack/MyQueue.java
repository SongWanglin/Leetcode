class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;      // cache stack
    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack2.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        emptyCache();
        return (stack1.empty())? -1: stack1.pop();
    }

    /** Get the front element. */
    public int peek() {
        emptyCache();
        return (stack1.empty())? -1: stack1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }

    private void emptyCache(){
        if( stack1.empty() && !stack2.empty() ){
            while(!stack2.empty())
                stack1.push(stack2.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
