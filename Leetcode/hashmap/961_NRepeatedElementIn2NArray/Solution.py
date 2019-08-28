class Solution(object):
    def repeatedNTimes(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        for i in xrange(2, len(A)):
            if A[i]==A[i-1] or A[i]==A[i-2]:
                return A[i]
        return A[0]
