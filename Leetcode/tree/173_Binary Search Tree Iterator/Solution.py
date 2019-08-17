# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class BSTIterator(object):

    def __init__(self, root):
        """
        :type root: TreeNode
        """
        self.stack = []
        self.current = root

    def next(self):
        """
        @return the next smallest number
        :rtype: int
        """
        while self.current:
            self.stack.append(self.current)
            self.current = self.current.left
        res = self.stack.pop()
        self.current = res.right
        return res.val

    def hasNext(self):
        """
        @return whether we have a next smallest number
        :rtype: bool
        """
        return self.stack or self.current
