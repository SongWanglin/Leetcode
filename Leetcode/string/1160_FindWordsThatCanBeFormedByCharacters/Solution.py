class Solution(object):
    def countCharacters(self, words, chars):
        """
        :type words: List[str]
        :type chars: str
        :rtype: int
        """
        counter = 0
        for w in words:
            included = True
            charsList = [c for c in chars]
            for c in w:
                if c in charsList:
                    charsList.remove(c)
                else:
                    included = False
                    break
            if included: counter = counter+len(w)
        return counter
