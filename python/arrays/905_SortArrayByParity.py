class Solution:
    def sortArrayByParity(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        from collections import deque
        queue = deque();
        for i in A:
            if i%2==0: queue.appendleft(i);
            else:      queue.append(i);
        return list(queue);