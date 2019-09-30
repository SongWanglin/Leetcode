"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, neighbors):
        self.val = val
        self.neighbors = neighbors
"""
class Solution(object):
    def cloneGraph(self, node):
        """
        :type node: Node
        :rtype: Node
        """
        graph = collections.defaultdict(list)
        visited = set()
        def dfs(node):
            if node.val in visited:
                return None
            visited.add(node.val)
            graph[node.val] = []
            for n in node.neighbors:
                graph[node.val].append(n.val)
                dfs(n)
        dfs(node)
        dic = {}
        for k in graph:
            dic[k] = Node(k, [])
        for k in graph:
            for v in graph[k]:
                dic[k].neighbors.append(dic[v])
        return dic[node.val]
