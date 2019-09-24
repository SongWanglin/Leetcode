# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def distanceK(self, root, target, K):
        """
        :type root: TreeNode
        :type target: TreeNode
        :type K: int
        :rtype: List[int]
        """
        graph = collections.defaultdict(list)
        def dfs(parent, child):
            if parent and child:
                graph[parent.val].append(child.val)
                graph[child.val].append(parent.val)
            if child.left:
                dfs(child, child.left)
            if child.right:
                dfs(child, child.right)
        dfs(None, root)
        bfs = [target.val]
        visited = set(bfs)
        for i in range(K):
            bfs = [y for x in bfs for y in graph[x] if y not in visited]
            visited |= set(bfs)
        return bfs
