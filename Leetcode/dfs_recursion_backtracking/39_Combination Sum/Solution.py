class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        def dfs(temp, sumOfTemp):
            if sumOfTemp >= target:
                list.sort(temp)
                if sumOfTemp == target and not temp in res:
                    res.append(temp)
                return
            for num in candidates:
                dfs(temp+[num], sumOfTemp+num)
        res = []
        dfs([], 0)
        return res
