class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        addOne, maxLen = 0, max(len(a), len(b))
        res = []
        i = 1
        while i<=maxLen or addOne:
            aDigit = int(a[-i]) if i<=len(a) else 0
            bDigit = int(b[-i]) if i<=len(b) else 0
            res.append( str((aDigit+bDigit+addOne)%2) )
            addOne = (aDigit+bDigit+addOne)//2
            i += 1
        list.reverse(res)
        return ''.join(res)
