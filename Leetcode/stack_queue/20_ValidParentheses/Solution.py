class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stk = []
        checkParen = lambda c1, c2: (c1=='(' and c2==')' ) or (c1=='{' and c2=='}') or (c1=='[' and c2==']')
        for char in s:
            if char == '(' or char == '[' or char == '{':
                stk.append(char)
            elif stk and checkParen(stk[-1], char):
                stk.pop()
            else:
                return False
        return True if not stk else False
