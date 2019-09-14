class Solution(object):
    def removeOuterParentheses(self, S):
        """
        :type S: str
        :rtype: str
        """
        stk = []
        count, leftmost =0, 0
        for i in xrange(0, len(S)):
            count += 1 if S[i]=='(' else -1
            stk.append(S[i])
            if count == 0:
                stk.pop(leftmost)
                stk.pop()
                leftmost = len(stk)
        return "".join(stk)
