# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findMode(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if not root:
            return []
        count = collections.Counter()
        self.dfs(root, count)
        max_count = max(count.itervalues())
        return [k for k, v in count.iteritems() if v == max_count]

    def dfs(self, root, count):
        if not root: return
        self.dfs(root.left,count)
        count[root.val] += 1
        self.dfs(root.right, count)
