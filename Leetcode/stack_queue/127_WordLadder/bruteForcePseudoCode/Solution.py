class Solution(object):
    def ladderLength(self, beginWord, endWord, wordList):
        """
        :type beginWord: str
        :type endWord: str
        :type wordList: List[str]
        :rtype: int
        """
        if not endWord in wordList:
            return 0
        wordDiff = lambda word1, word2: abs( len(word1) - sum(list(map(word1.count, word2))) )
        def wordDiff(word1, word2):
            res = 0
            for i in range(len(word1)):
                if(word1[i]!=word2[i]):
                    res += 1
            return res
        res = 1
        curlevel = [beginWord]
        while endWord not in curlevel:
            nextlevel = [dest for src in curlevel for dest in wordList if wordDiff(src, dest)==1]
            if not nextlevel:
                return 0
            res += 1
            curlevel = nextlevel
        return res
