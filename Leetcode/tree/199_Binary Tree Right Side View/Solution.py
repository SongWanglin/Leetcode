# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def rightSideView(self, root: TreeNode) -> List[int]:
        levels = []
        dq = collections.deque([])
        res = []
        if not root: return res
        dq.append(root)
        while dq:
            size = len(dq)
            level = []
            for i in range(size):
                temp = dq.popleft()
                level.append(temp.val)
                if temp.left:
                    dq.append(temp.left)
                if temp.right:
                    dq.append(temp.right)
            levels.append(level)

        for i in range(len(levels)):
            res.append(levels[i][-1])
        return res
