class MyQueue {
    Stack<Integer> stk1;
    Stack<Integer> stk2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        moveStack(stk1, stk2); stk2.push(x); moveStack(stk2, stk1);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stk1.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stk1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (stk1.size()==0)&&(stk2.size()==0);
    }
        private void moveStack(Stack src, Stack dest){
            while(src.size()!=0){
                dest.push(src.pop());
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
