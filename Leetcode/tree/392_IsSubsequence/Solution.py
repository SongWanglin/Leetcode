class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if s=="":
            return True
        l1 = list(s)
        l2 = list(t)
        for i in range(len(l2)):
            if l1 and l1[0] == l2[i]:
                l1.pop(0)
        return l1 == []
