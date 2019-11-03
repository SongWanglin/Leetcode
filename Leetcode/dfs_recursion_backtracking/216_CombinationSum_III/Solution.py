class Solution(object):
    def combinationSum3(self, k, n):
        """
        :type k: int
        :type n: int
        :rtype: List[List[int]]
        """
        def dfs(start, total, temp):
            if total>n or len(temp)>k:
                return
            if total==n and len(temp)==k:
                res.append(temp)
                return
            for i in range(start, 10):
                dfs(i+1, total+i, temp+[i])
        res =[]
        dfs(1, 0, [])
        return res
