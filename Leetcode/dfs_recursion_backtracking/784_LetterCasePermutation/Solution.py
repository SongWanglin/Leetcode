class Solution(object):
    def letterCasePermutation(self, S):
        """
        :type S: str
        :rtype: List[str]
        """
        res = []
        def dfs(i, S, temp):
            if i==len(S):
                res.append("".join(temp))
                return
            if S[i].isalpha():
                temp.append(S[i].lower())
                dfs(i+1, S, temp)
                temp.pop()
                temp.append(S[i].upper())
                dfs(i+1, S, temp)
                temp.pop()
            else:
                temp.append(S[i])
                dfs(i+1, S, temp)
                temp.pop()
        dfs(0, S, [])
        return res
