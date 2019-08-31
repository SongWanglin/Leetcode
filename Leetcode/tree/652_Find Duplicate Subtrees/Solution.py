# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findDuplicateSubtrees(self, root):
        """
        :type root: TreeNode
        :rtype: List[TreeNode]
        """
        res = []
        dic = collections.defaultdict()
        self.preorder(root, dic, res)
        return res
    def preorder(self, root, dic, res):
        if not root: return "#"
        serial = str(root.val)+","+self.preorder(root.left, dic, res)+","+self.preorder(root.right, dic, res)
        if(dic.get(serial, 0)==1):
            res.append(root)
        dic[serial] = dic.get(serial, 0)+1
        return serial
