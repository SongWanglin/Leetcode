class Solution(object):
    def pathInZigZagTree(self, label):
        """
        :type label: int
        :rtype: List[int]
        """
        res = collections.deque([])
        if label<=0: return res
        level = 0
        while 2**level-1<label:
            level+=1
        level-=1
        while level!=0:
            res.appendleft(label)
            pos = label - 2**level
            label -= (pos+1)+pos/2
            level-=1
        res.appendleft(1)
        return res
