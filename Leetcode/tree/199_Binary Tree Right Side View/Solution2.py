# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def rightSideView(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        levels = []
        self.bfs(levels, root, 0)
        res = []
        for i in range(len(levels)):
            res.append(levels[i][-1])
        return res

    def bfs(self, levels, root, level):
        if not root: return
        if level>=len(levels):
            levels.append([])
        self.bfs(levels, root.left, level+1)
        self.bfs(levels, root.right, level+1)
        levels[level].append(root.val)

