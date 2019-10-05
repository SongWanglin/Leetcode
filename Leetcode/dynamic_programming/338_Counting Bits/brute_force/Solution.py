class Solution(object):
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        def count(num):
            res = 0
            while num:
                res += num%2
                num = num//2
            return res
        res = [count(i) for i in range(num+1)]
        return res
