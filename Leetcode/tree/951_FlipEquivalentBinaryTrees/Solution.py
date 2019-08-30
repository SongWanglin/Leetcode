# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def flipEquiv(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: bool
        """
        if not root1 and not root2: return True
        if not root1 or not root2: return False
        if root1.val!=root2.val: return False
        left1 = -1 if not root1.left else root1.left.val
        right1 = -1 if not root1.right else root1.right.val
        left2 = -1 if not root2.left else root2.left.val
        right2 = -1 if not root2.right else root2.right.val
        if left1==right2 and left2==right1:
            temp = root1.left
            root1.left = root1.right
            root1.right = temp
        return self.flipEquiv(root1.left, root2.left) and self.flipEquiv(root1.right, root2.right)
