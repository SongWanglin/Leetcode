class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        if not digits:
            return [1]
        return self.plusOne(digits[0:-1])+[0] if digits[-1]+1==10 else digits[0:-1]+[digits[-1]+1]
