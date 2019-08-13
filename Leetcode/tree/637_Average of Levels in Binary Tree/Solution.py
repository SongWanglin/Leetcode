# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
from collections import deque
class Solution(object):
    def averageOfLevels(self, root):
        """
        :type root: TreeNode
        :rtype: List[float]
        """
        res = []
        if not root: return res
        dq = deque()
        dq.append(root)
        while dq:
            n = len(dq)
            div = 0.0
            for x in range(0, n):
                temp = dq.popleft()
                div += temp.val
                if temp.left: dq.append(temp.left)
                if temp.right: dq.append(temp.right)
            div = div/n
            res.append(div)
        return res
