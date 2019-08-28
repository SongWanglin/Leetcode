class Solution(object):
    def findOcurrences(self, text, first, second):
        """
        :type text: str
        :type first: str
        :type second: str
        :rtype: List[str]
        """
        if not text:
            return None
        res = []
        strs = text.split(" ")
        for i in range(0, len(strs)-2):
            if strs[i]==first and strs[i+1]==second:
                res.append(strs[i+2])
        return res
