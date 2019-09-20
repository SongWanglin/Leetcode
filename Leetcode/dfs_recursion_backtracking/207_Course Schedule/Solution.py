class Solution(object):
    def canFinish(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: bool
        """
        n = numCourses
        graph = collections.defaultdict(list)
        for u, v in prerequisites:
            graph[u] += [v]
        res, visited = [True], [0]*n    # visit state: -1~visiting 0~unvisited 1~visited
        def dfs(u):
            visited[u] = 1
            for v in graph[u]:
                if visited[v]==1:
                    res[0] = False
                if not visited[v]:
                    dfs(v)
            visited[u] = -1
        for course in range(n):
            dfs(course)
        return res[0]
