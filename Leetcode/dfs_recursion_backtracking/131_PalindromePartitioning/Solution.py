class Solution(object):
    def partition(self, s):
        """
        :type s: str
        :rtype: List[List[str]]
        """
        res = []
        def dfs(string, temp):
            if not string:
                res.append(temp)
                return
            for i in range(1, len(string)+1):
                sub = string[0:i]
                if sub==sub[::-1]:
                    dfs(string[i:], temp+[sub])
        dfs(s, [])
        return res
