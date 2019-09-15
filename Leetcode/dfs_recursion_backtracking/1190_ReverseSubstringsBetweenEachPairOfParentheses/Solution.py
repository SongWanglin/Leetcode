class Solution(object):
    def reverseParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        left = s.find("(")
        if left==-1:
            return s
        right = len(s)
        count = 1
        for i in xrange(left+1, len(s)):
            if s[i]=="(":
                count+=1
            elif s[i]==")":
                count-=1
            else:
                count+=0
            if count==0:
                right = i;
                break
        middle = self.reverseParentheses(s[left+1:right])
        return s[:left]+middle[::-1]+self.reverseParentheses(s[right+1:])

