class DinnerPlates(object):

    def __init__(self, capacity):
        """
        :type capacity: int
        """
        self.cap = capacity
        self.stacks = []
        self.heap = []

    def push(self, val):
        """
        :type val: int
        :rtype: None
        """
        while len(self.heap):
            index = heapq.heappop(self.heap)
            if index < len(self.stacks) and len(self.stacks[index]) < self.cap:
                self.stacks[index].append(val)
                return
        if len(self.stacks) > 0 and len(self.stacks[-1]) < self.cap:
            self.stacks[-1].append(val)
        else:
            self.stacks.append([val])

    def pop(self):
        """
        :rtype: int
        """
        if len(self.stacks) == 0:
            return -1
        res = self.stacks[-1].pop()
        if len(self.stacks[-1]) == 0:
            self.stacks.pop()
        else:
            heapq.heappush(self.heap, len(self.stacks)-1)
        return res

    def popAtStack(self, index):
        """
        :type index: int
        :rtype: int
        """
        if index >= len(self.stacks) or len(self.stacks[index]) == 0:
            return -1
        res = self.stacks[index].pop()
        if len(self.stacks[-1]) == 0:
            self.stacks.pop()
        else:
            heapq.heappush(self.heap, index)
        return res


# Your DinnerPlates object will be instantiated and called as such:
# obj = DinnerPlates(capacity)
# obj.push(val)
# param_2 = obj.pop()
# param_3 = obj.popAtStack(index)
