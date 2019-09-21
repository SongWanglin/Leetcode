# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def widthOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root: return 0
        level = collections.deque([root])
        res = -sys.maxsize
        while level:
            n = len(level)
            res = max(n, res)
            #print(level)
            nextlevel = collections.deque([])
            for i in range(n):
                temp = level.popleft()
                if not temp:
                    nextlevel += [None, None]
                else:
                    nextlevel += [temp.left, temp.right]
            while nextlevel and not nextlevel[0]:
                nextlevel.popleft()
            while nextlevel and not nextlevel[-1]:
                nextlevel.pop()
            level = nextlevel
        return res
