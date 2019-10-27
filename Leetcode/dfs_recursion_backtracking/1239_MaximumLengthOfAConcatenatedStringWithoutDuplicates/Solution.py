class Solution(object):
    def maxLength(self, arr):
        """
        :type arr: List[str]
        :rtype: int
        """
        def hasDuplicate(string):
            counts = [string.count(c) for c in string]
            return False if not counts else max(counts)>1
        def dfs(pattern, strs):
            if not strs or hasDuplicate(pattern):
                return
            for i in range(len(strs)):
                temp = pattern + strs[i]
                if hasDuplicate(temp):
                    continue
                res[0] = max(res[0], len(temp))
                dfs(temp, strs[i+1:])
        res = [0]
        for i in range(len(arr)):
            dfs("", arr[i:])
        return res[0]
