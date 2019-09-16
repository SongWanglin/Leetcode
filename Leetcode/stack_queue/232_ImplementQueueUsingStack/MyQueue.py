class MyQueue(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.stack1 = []
        self.stack2 = []       # cache stack

    def push(self, x):
        """
        Push element x to the back of queue.
        :type x: int
        :rtype: None
        """
        self.stack2.append(x)

    def pop(self):
        """
        Removes the element from in front of queue and returns that element.
        :rtype: int
        """
        self.emptyCache();
        return self.stack1.pop() if self.stack1 else -1

    def peek(self):
        """
        Get the front element.
        :rtype: int
        """
        self.emptyCache();
        return self.stack1[-1] if self.stack1 else -1

    def empty(self):
        """
        Returns whether the queue is empty.
        :rtype: bool
        """
        return not (self.stack1 or self.stack2)

    def emptyCache(self):
        """
        Dump the second stack into the first one
        :rtype: None
        """
        if not self.stack1 and self.stack2:
            while self.stack2:
                self.stack1.append(self.stack2.pop())

# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()
