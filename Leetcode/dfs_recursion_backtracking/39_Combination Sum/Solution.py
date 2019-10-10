class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        def dfs(temp, preSum, candidates):
            if preSum < 0:
                return
            if preSum==0:
                res.append(temp)
                return
            for i in range(len(candidates)):
                dfs(temp+[candidates[i]], preSum-candidates[i], candidates[i:])
        res = []
        dfs([], target, candidates)
        return res
