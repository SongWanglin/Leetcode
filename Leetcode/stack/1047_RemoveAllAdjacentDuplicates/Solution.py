class Solution(object):
    def removeDuplicates(self, S):
        """
        :type S: str
        :rtype: str
        """
        if not S: return S
        stk = []
        tracker = 0
        while tracker<len(S):
            if not stk or S[tracker]!=stk[-1]:
                stk.append(S[tracker])
                tracker += 1
            else:
                temp = stk.pop()
                tracker +=1
        return "".join(stk)
