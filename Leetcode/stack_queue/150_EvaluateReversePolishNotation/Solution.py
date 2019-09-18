class Solution(object):
    def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        ops = { "+": operator.add, "-": operator.sub, "*": operator.mul, "/":operator.floordiv}
        stack = []
        for token in tokens:
            if token not in ops:
                stack.append(int(token))
            elif token=="/":
                sign = -1 if stack[-2]*stack[-1] <0 else 1
                stack.append( sign*ops[token]( abs(stack.pop(-2)), abs(stack.pop()) ) )
            else:
                stack.append( round(ops[token]( stack.pop(-2), stack.pop() )) )
        return int(stack[-1])
