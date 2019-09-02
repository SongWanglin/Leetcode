class Solution(object):
    def findRedundantConnection(self, edges):
        """
        :type edges: List[List[int]]
        :rtype: List[int]
        """
        pred = [0]*2001
        for i in xrange(0, 2001):
            pred[i] = i
        res = [-1, -1]
        for edge in edges:
            src, dest = edge[0], edge[1]
            while pred[src]!=src:
                src = pred[src]
            while pred[dest]!=dest:
                dest = pred[dest]
            if src==dest:
                res = edge
            else:
                pred[dest] = src
        return res
