class Solution:
    def braceExpansionII(self, expression: str) -> List[str]:
        self.index = 0
        def dfs():
            union, product = set(), set([''])
            while self.index < len(expression):
                if expression[self.index] == '{':
                    self.index += 1
                    product = set(map(''.join, itertools.product(product,dfs())))
                elif expression[self.index] == ',':
                    union |= product
                    product = set([''])
                    self.index += 1
                elif expression[self.index] == '}':
                    self.index += 1
                    return union | product
                else:
                    product = set(map(''.join, itertools.product(product, [expression[self.index]])))
                    self.index += 1
            return union | product

        return sorted(dfs())
