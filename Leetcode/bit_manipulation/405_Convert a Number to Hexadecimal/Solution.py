class Solution(object):
    def toHex(self, num):
        """
        :type num: int
        :rtype: str
        """
        hex_l = list(map(str,range(0,10))) + ['a','b','c','d','e','f']
        ans = ''
        if num < 0:
            num += 2**32
        while num >= 16:
            num,mod = divmod(num,16)
            ans += hex_l[mod]
        ans += hex_l[num]
        return ans[::-1]
