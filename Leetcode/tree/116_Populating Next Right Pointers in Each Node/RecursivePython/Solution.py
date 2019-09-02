"""
# Definition for a Node.
class Node:
    def __init__(self, val, left, right, next):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""
class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if not root: return None
        self.bfs(root.left, root.right)
        return root

    def bfs(self, node1: 'Node', node2: 'Node') -> 'None':
        if not node1: return None
        node1.next = node2
        self.bfs(node1.left, node1.right)
        self.bfs(node1.right, node2.left)
        self.bfs(node2.left, node2.right)
