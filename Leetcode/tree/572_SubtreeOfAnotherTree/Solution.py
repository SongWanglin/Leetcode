# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSubtree(self, s, t):
        """
        :type s: TreeNode
        :type t: TreeNode
        :rtype: bool
        """
        if not s: return False;
        return self.same(s, t) or self.isSubtree(s.left, t) or self.isSubtree(s.right, t)

    def same(self, s, t):
        if not s and not t: return True
        if not s or not t: return False
        return s.val==t.val and self.same(s.left, t.left) and self.same(s.right, t.right)
