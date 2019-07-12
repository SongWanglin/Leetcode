class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        #return str(int(a)+int(b))
        if len(num1) < len(num2):
            num1,num2 = num2,num1

        l1 = list(num1)
        l2 = ['0'] * (len(num1) - len(num2)) + list(num2)
        ans = []
        carry = 0
        for i in xrange(len(l1) - 1,- 1,- 1):
            carry,res = divmod(int(l1[i]) + int(l2[i]) + carry,10)
            ans.append(str(res))
        if carry:
            ans.append(str(carry))

        return ''.join(ans[:: - 1])
