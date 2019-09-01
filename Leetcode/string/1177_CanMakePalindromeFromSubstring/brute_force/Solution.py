class Solution(object):
    def canMakePaliQueries(self, s, queries):
        """
        :type s: str
        :type queries: List[List[int]]
        :rtype: List[bool]
        """
        res = []
        for i in range(len(queries)):
            start, end = queries[i][0], queries[i][1]
            subs = s[start:end+1]
            extra = 0
            for chars, cnt in collections.Counter(subs).items():
                extra += cnt%2
            res.append((extra//2)<=queries[i][2])
        return res
