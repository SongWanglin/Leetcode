class Solution(object):
    def minFlips(self, a, b, c):
        """
        :type a: int
        :type b: int
        :type c: int
        :rtype: int
        """
        res = 0
        if (a or b) is c:
            return res
        while (a or b or c):
            A, B, C = a%2, b%2, c%2
            if C==1 and (A==0 and B==0):
                res += 1
            elif C==0:
                res += (A==1)+(B==1)
            a, b, c = a//2, b//2, c//2
        return res
