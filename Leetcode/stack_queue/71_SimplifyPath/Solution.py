class Solution(object):
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        stack = []
        paths = list(filter(lambda s: s!='', path.split('/')))
        for token in paths:
            if token=='..':
                if stack:
                    stack.pop()
            elif token == '.':
                continue
            else:
                stack.append(token)
        return "/"+"/".join(stack)
