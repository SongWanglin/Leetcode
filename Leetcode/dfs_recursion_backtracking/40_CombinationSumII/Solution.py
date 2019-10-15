class Solution(object):
    def combinationSum2(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        list.sort(candidates)
        def dfs(temp, start, preSum):
            if preSum==0 and not temp in res:
                res.append(list(temp))
                return
            elif preSum<0:
                return
            for i in range(start, len(candidates)):
                temp.append(candidates[i])
                dfs(temp, i+1, preSum-candidates[i])
                temp.pop()
                if(preSum-candidates[i]<0): break
        res = []
        dfs([], 0, target)
        return res
