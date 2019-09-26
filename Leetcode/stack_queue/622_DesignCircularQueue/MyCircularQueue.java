class MyCircularQueue {
    int[] queue;
    int front, rear, currentSize;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue = new int[k];
        front = -1;
        rear = -1;
        currentSize = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        rear = (rear+1)%(queue.length);
        queue[rear] = value;
        currentSize += 1;
        if(front==-1)
            front = rear;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty())
            return false;
        front = (front+1)%(queue.length);
        currentSize -= 1;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return (isEmpty())? -1: queue[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        return (isEmpty())? -1: queue[rear];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return currentSize==0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return currentSize==queue.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
