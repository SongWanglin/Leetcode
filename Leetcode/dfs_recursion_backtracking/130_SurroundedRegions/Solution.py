class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        if not board: return
        def borderDFS(i, j):
            if not (0<=i<len(board) and 0<=j<len(board[i]) and board[i][j]=='O'):
                return
            board[i][j] = 'x'
            borderDFS(i+1, j);borderDFS(i-1, j);borderDFS(i, j+1);borderDFS(i, j-1);
        for i in range(len(board)):
            for j in range(len(board[i])):
                if 0<i<len(board)-1 and 0<j<len(board[i])-1:
                    continue
                borderDFS(i, j)
        for i in range(len(board)):
            for j in range(len(board[i])):
                if board[i][j]=='X':
                    continue
                board[i][j] = 'X' if board[i][j]=='O' else 'O';
