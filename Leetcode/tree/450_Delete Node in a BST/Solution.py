# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def deleteNode(self, root, key):
        """
        :type root: TreeNode
        :type key: int
        :rtype: TreeNode
        """
        if not root: return None
        if root.val==key:
            root = self.mergeBST(root.left, root.right)
        elif root.val > key:
            root.left = self.deleteNode(root.left, key)
        else:
            root.right = self.deleteNode(root.right, key)
        return root

    def mergeBST(self, a, b):
        if not a: return b
        if not b: return a
        if a.val > b.val:
            temp = b.right
            b.right = None
            a.left = self.mergeBST(a.left, b)
            a = self.mergeBST(a, temp)
            return a
        else:
            temp = a.right
            a.right = None
            b.left = self.mergeBST(b.left, a)
            b = self.mergeBST(b, temp)
            return b
