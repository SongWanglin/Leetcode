class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        if not intervals: return []
        xs = sorted(intervals, key = lambda x: x[0])
        res = []
        def mergeInterval(interval1, interval2):
            res = [min(interval1[0], interval2[0]), max(interval1[1], interval2[1])]
            return res
        res.append(xs[0])
        for i in range(1, len(xs)):
            if xs[i][0] <= res[-1][1]:
                temp = res.pop()
                res.append(mergeInterval(temp, xs[i]))
            else:
                res.append(xs[i])
        return res
