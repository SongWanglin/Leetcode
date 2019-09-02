"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, left, right, next):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""
class Solution(object):
    def connect(self, root):
        """
        :type root: Node
        :rtype: Node
        """
        if not root: return None
        queue = collections.deque([])
        queue.append(root)
        while queue:
            size = len(queue)
            for i in xrange(0, size):
                temp = queue.popleft()
                queue += filter(None, [temp.left, temp.right])
                temp.next = None if i==size-1 else queue[0]
        return root
