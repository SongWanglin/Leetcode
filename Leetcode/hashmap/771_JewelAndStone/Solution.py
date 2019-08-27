class Solution(object):
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        """
        s = set()
        for c in J:
            s.add(c)
        res = 0
        for c in S:
            if c in s:
                res+=1
        return res
        """
        return sum(map(S.count, J))
