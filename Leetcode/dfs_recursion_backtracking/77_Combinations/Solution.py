class Solution(object):
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        nums = [i for i in range(1, n+1)]
        res = []
        def dfs(temp, k, start):
            if k == 0:
                res.append(list(temp))
                return
            for i in range(start, len(nums)):
                temp.append(nums[i])
                dfs(temp, k-1, i+1)
                temp.pop()
        dfs([], k, 0)
        return res
