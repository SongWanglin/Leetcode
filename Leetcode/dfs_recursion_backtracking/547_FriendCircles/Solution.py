class Solution(object):
    def findCircleNum(self, M):
        """
        :type M: List[List[int]]
        :rtype: int
        """
        def dfs(num):
            if M[num][num]==-1:
                return
            M[num][num] = -1
            for i in xrange(0, len(M[num])):
                if(M[num][i]==1):  dfs(i)
        res = 0
        for i in xrange(0, len(M)):
            if M[i][i]==1:
                dfs(i)
                res += 1
        return res
