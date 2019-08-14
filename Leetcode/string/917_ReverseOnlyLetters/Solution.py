class Solution(object):
    def reverseOnlyLetters(self, S):
        """
        :type S: str
        :rtype: str
        """
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
        s = list(S)
        head = 0
        tail = len(s)-1
        while head < tail:
            while head < len(s) and s[head] not in alphabet:
                head += 1
            while tail > 0 and s[tail] not in alphabet:
                tail -= 1
            if head < tail:
                s[head], s[tail] = s[tail], s[head]
                head += 1
                tail -= 1
        return ''.join(s)

