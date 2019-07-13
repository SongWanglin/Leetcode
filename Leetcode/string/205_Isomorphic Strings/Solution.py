class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        char_map = {}
        seen = set()
        for i,j in zip(s , t):
            if i in char_map:
                if j != char_map[i]:
                    return False
            else:
                if j in seen:
                    return False
                seen.add(j)
                char_map[i] = j
        return True
