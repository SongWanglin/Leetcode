class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        def dfs(temp, start, k):
            if k==0:
                res.append(list(temp))
                return
            for i in range(start, len(nums)):
                if i>start and nums[i-1]==nums[i]:
                    continue
                dfs(temp+[nums[i]], i+1, k-1)
        res = []
        list.sort(nums)
        for k in range(0, len(nums)+1):
            dfs([], 0, k)
        return res
