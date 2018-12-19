# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def Depth(self, root):
        if root is None: return 0; 
        L = self.Depth(root.left);
        R = self.Depth(root.right);
        if L==-1 or R==-1 or abs(L-R)>1: return -1;
        return 1+max(L,R);
    
    def isBalanced(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """    
        return self.Depth(root)!=-1;