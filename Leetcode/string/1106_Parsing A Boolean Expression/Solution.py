class Solution:
    def parseBoolExpr(self, expression: str) -> bool:
        if len(expression) == 1:
            return expression == 't'
        op = expression[0]
        boolean_list = []
        level = 0
        start = 2
        for i in range(2, len(expression) - 1):
            ch = expression[i]
            if ch == '(':
                level += 1
            elif ch == ')':
                level -= 1
            elif ch == ',' and level == 0:
                boolean_list.append(self.parseBoolExpr(expression[start:i]))
                start = i+1
            elif ch not in '&|!' and level == 0:
                boolean_list.append(True if ch == 't' else False)
        boolean_list.append(self.parseBoolExpr(expression[start:-1]))
        if op == '!':
            return not boolean_list[0]
        elif op == '&':
            return all(boolean_list)
        else:
            return any(boolean_list)
