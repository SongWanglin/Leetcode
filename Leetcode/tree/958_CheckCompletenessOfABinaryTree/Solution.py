# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isCompleteTree(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        dq = collections.deque([root])
        def depth(root):
            if not root:
                return 0
            return 1+max(depth(root.left), depth(root.right))
        dep = depth(root)-1
        for i in range(dep-1):
            n = len(dq)
            for i in range(n):
                temp = dq.popleft()
                childs = list(filter(None, [temp.left, temp.right]))
                if len(childs) == 2:
                    dq += childs
                else:
                    return False
        n = len(dq)
        for i in range(n):
            temp = dq.popleft()
            if (dq and not dq[-1] and temp.left) or (temp.right and not temp.left):
                return False
            else:
                dq += [temp.left, temp.right]
        return True
