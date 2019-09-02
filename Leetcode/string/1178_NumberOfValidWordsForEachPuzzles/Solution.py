class Solution(object):
    def findNumOfValidWords(self, words, puzzles):
        """
        :type words: List[str]
        :type puzzles: List[str]
        :rtype: List[int]
        """
        """
        #TLE solution
        res = []
        for puzzle in puzzles:
            cnt = 0
            for word in words:
                if word.count(puzzle[0])>0 and all(map(puzzle.count, word)):
                    cnt+=1
            res.append(cnt)
        return res
        """
        count = collections.Counter(frozenset(w) for w in words)
        res = []
        for p in puzzles:
            cur = 0
            for k in xrange(len(p)):
                for c in itertools.combinations(p[1:], k):
                    cur += count[frozenset(tuple(p[0]) + c)]
            res.append(cur)
        return res
