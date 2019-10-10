class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        dic = {1:"", 2:"abc", 3:"def", 4:"ghi", 5:"jkl",
               6:"mno", 7:"pqrs", 8:"tuv", 9:"wxyz"}
        res = []
        def dfs(temp, index):
            if index >= len(digits):
                if temp:
                    res.append("".join(temp))
                return
            k = int(digits[index])
            for ch in dic[k]:
                dfs(temp+[ch], index+1)
        dfs([], 0)
        return res
