class Solution(object):
    def isMatch(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: bool
        """
        if not p:
            return not s
        if not s:
            return (not p) or self.isMatch(s, p[2:]) if len(p)>1 and p[1]=='*' else False
        if p[0]!='.' and s[0]!=p[0]:
            return self.isMatch(s, p[2:]) if len(p)>1 and p[1]=='*' else False
        if len(p)>1 and p[1]=='*':
            return self.isMatch(s[1:], p) or self.isMatch(s, p[2:])
        return self.isMatch(s[1:], p[1:])
