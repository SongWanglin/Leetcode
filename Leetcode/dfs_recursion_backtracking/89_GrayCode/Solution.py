class Solution(object):
    def grayCode(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        visited = set()
        def dfs():
            if len(visited)==2**n:
                return True
            for i in range(n):
                nxt = (res[-1]^(1<<i))
                if nxt in visited or nxt >= 2**n:
                    continue
                visited.add(nxt)
                res.append(nxt)
                if dfs():
                    return True
                res.pop()
                visited.remove(nxt)
        res = [0]
        visited.add(0)
        dfs()
        return res
