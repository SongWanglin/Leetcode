# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def bstFromPreorder(self, preorder):
        """
        :type preorder: List[int]
        :rtype: TreeNode
        """
        if not preorder: return None
        if len(preorder)==1: return TreeNode(preorder[0])
        left, right = 1000, 1000
        for i, num in enumerate(preorder):
            if num < preorder[0]:
                left = i
                break
        for i, num in enumerate(preorder):
            if num > preorder[0]:
                right = i
                break
        root = TreeNode(preorder[0])
        root.left = self.bstFromPreorder(preorder[left:right])
        root.right = self.bstFromPreorder(preorder[right:])
        return root
