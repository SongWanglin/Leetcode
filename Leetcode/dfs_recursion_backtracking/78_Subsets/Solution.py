class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def dfs(temp, k, start):
            if len(temp)==k:
                res.append(list(temp))
            for i in range(start, len(nums)):
                temp.append(nums[i])
                dfs(temp, k, i+1)
                temp.pop()
        res = []
        for i in range(len(nums)+1):
            dfs([], i, 0)
        return res
