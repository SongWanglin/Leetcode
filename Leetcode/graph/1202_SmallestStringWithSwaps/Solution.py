class Solution(object):
    def smallestStringWithSwaps(self, s, pairs):
        """
        :type s: str
        :type pairs: List[List[int]]
        :rtype: str
        """
        def dfs(i):
            visited[i] = True
            component.append(i)
            for j in adj_lst[i]:
                if not visited[j]:
                    dfs(j)

        n = len(s)
        adj_lst = [[] for _ in range(n)]
        for i, j in pairs:
            adj_lst[i].append(j)
            adj_lst[j].append(i)
        visited = [False for _ in range(n)]
        res = list(s)
        for i in range(n):
            if not visited[i]:
                component = []
                dfs(i)
                #print(component)
                component.sort()
                #print(component)
                chars = [res[k] for k in component]
                #print(chars)
                chars.sort()
                #print(chars)
                for i in range(len(component)):
                    res[component[i]] = chars[i]
        return ''.join(res)
