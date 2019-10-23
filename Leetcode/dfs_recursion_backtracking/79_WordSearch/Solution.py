class Solution(object):
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        if not word:
            return True
        visited = [[False for _ in range(len(board[0]))] for _ in range(len(board))]
        def dfs(i, j, pattern):
            if not pattern:
                return True
            if i<0 or j<0 or i>=len(board) or j>=len(board[i]) or visited[i][j] or pattern[0]!=board[i][j]:
                return False
            visited[i][j] = True
            res = dfs(i+1, j, pattern[1:]) or dfs(i, j+1, pattern[1:]) or dfs(i-1, j, pattern[1:]) or dfs(i, j-1, pattern[1:])
            visited[i][j] = False
            return res
        res = False
        for i in range(len(board)):
            for j in range(len(board[i])):
                if board[i][j]==word[0]:
                    res |= dfs(i, j, word)
        return res
