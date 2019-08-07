"""
# Definition for a Node.
class Node:
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        res = []
        if root is None:return res
        res.append(root.val);
        for child in root.children:
            res.extend(self.preorder(child))
        return res
