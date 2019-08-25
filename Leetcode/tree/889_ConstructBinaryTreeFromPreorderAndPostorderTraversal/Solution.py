# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def constructFromPrePost(self, pre, post):
        """
        :type pre: List[int]
        :type post: List[int]
        :rtype: TreeNode
        """
        dq = collections.deque([])
        dq.append(TreeNode(pre[0]))
        j = 0
        for i in xrange(1, len(pre)):
            node = TreeNode(pre[i])
            while dq[-1].val == post[j]:
                dq.pop()
                j += 1
            if dq[-1].left is None:
                dq[-1].left = node
            else:
                dq[-1].right = node
            dq.append(node)
        return dq[0]
