class Solution:
    def findMinHeightTrees(self, n: int, edges: List[List[int]]) -> List[int]:
        graph = collections.defaultdict(list)
        for i in range(n):
            graph[i] = []
        for node1, node2 in edges:
            graph[node1].append(node2)
            graph[node2].append(node1)
        def bfs(graph, src):
            visited = set()
            cur = collections.deque([src])
            res = 0
            while cur:
                n = len(cur)
                for i in range(n):
                    node = cur.popleft()
                    visited.add(node)
                    for neighbor in graph[node]:
                        if neighbor in visited:
                            continue
                        cur.append(neighbor)
                if cur: res+=1
            return res
        minHeight = sys.maxsize
        res = []
        for i in range(n):
            h = bfs(graph, i)
            if h > minHeight:
                continue
            if h==minHeight:
                res.append(i)
            else:
                minHeight = h
                res.clear()
                res.append(i)
        return res

