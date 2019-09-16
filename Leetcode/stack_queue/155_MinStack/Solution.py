class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.minValue = sys.maxint
        self.stack = []

    def push(self, x):
        if x <= self.minValue:
            self.stack.append(self.minValue)
            self.minValue = x
        self.stack.append(x)

    def pop(self):
        if not self.stack:
            return
        if self.stack[-1]!=self.minValue:
            self.stack.pop()
        else:
            self.stack.pop()
            self.minValue = self.stack[-1]
            self.stack.pop()

    def top(self):
        return self.stack[-1]

    def getMin(self):
        return self.minValue


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
