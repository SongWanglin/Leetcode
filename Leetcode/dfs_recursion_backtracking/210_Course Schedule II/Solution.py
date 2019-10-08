class Solution(object):
    def findOrder(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: List[int]
        """
        graph = collections.defaultdict(list)
        for i in range(numCourses):
            graph[i] = []
        for course, preq in prerequisites:
            graph[preq].append(course)
        res = collections.deque([])
        visited = [0 for i in range(numCourses)]
        def dfs(node, graph, visited):
            if not visited[node]==0:
                return
            visited[node] = -1
            for neighbor in graph[node]:
                if(visited[neighbor]):
                    continue
                dfs(neighbor, graph, visited)
            if all([visited[i]==1 for i in graph[node]]) and not visited[node]==1:
                visited[node] = 1
                res.appendleft(node)
                return
        for i in range(numCourses):
            dfs(i, graph, visited)
        return res if len(res)==numCourses else []
