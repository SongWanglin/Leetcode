class Solution(object):
    def criticalConnections(self, n, connections):
        """
        :type n: int
        :type connections: List[List[int]]
        :rtype: List[List[int]]
        """
        connect = collections.defaultdict(list)
        for u,v in connections:
            connect[u] += [v]
            connect[v] += [u]
        self.dep = 0
        self.res = []
        depth, lowest, parent, visited = [float("inf")]*n, [float("inf")]*n, [float("inf")]*n, [False]*n
        def dfs(u):
            visited[u] = True
            depth[u], lowest[u] = self.dep, self.dep
            self.dep += 1
            for v in connect[u]:
                if not visited[v]:
                    parent[v] = u
                    dfs(v)
                if parent[u]!=v:
                    lowest[u] = min(lowest[u], lowest[v])
                    # upgrade the lowest so strongly connected graph has the same lowest
                if lowest[v]>depth[u]:
                    self.res.append([u,v])
        dfs(0)
        return self.res
