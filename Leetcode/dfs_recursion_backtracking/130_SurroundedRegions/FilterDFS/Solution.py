class Solution(object):
    def solve(self, board):
        """
        :type board: List[List[str]]
        :rtype: None Do not return anything, modify board in-place instead.
        """
        if not board:
            return
        n, m = len(board), len(board[0])
        boardFilter = lambda (i, j): 0 <= i < n and 0 <= j < m and board[i][j] == 'O'
        queue = filter(boardFilter, [x for i in range(max(n, m)) for x in ((i, 0), (i, m - 1), (0, i), (n - 1, i))])
        while queue:
            x, y = queue.pop()
            board[x][y] = 'M'
            queue.extend(filter(boardFilter, [(x + 1, y), (x - 1, y), (x, y + 1), (x, y - 1)]))
        board[:] = [['XO'[x == 'M'] for x in row] for row in board]
