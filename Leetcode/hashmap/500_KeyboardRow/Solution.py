class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        """
        row1 = set("qwertyuiopQWERTYUIOP")
        row2 = set("asdfghjklASDFGHJKL")
        row3 = set("ZXCVBNMzxcvbnm")
        return filter(lambda x: set(x).issubset(row1) or set(x).issubset(row2) or set(x).issubset(row3), words)
        """
        row1 = "qwertyuiop"
        row2 = "asdfghjkl"
        row3 = "zxcvbnm"
        res = []
        for s in words:
            c1 = sum(map(s.lower().count, row1))
            c2 = sum(map(s.lower().count, row2))
            c3 = sum(map(s.lower().count, row3))
            if (c1 and c2) + (c2 and c3) +(c1 and c3) == 0:
                res.append(s)
        return res
