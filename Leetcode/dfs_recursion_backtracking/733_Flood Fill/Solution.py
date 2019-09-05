class Solution(object):
    def floodFill(self, image, sr, sc, newColor):
        """
        :type image: List[List[int]]
        :type sr: int
        :type sc: int
        :type newColor: int
        :rtype: List[List[int]]
        """
        if image[sr][sc]==newColor:
            return image
        oldColor = image[sr][sc]
        def dfs(sr, sc):
            if (not (0 <= sr < len(image) and 0 <= sc < len(image[sr]))):
                return
            if image[sr][sc]!=oldColor:
                return
            image[sr][sc]=newColor
            [dfs(sr + x, sc + y) for (x, y) in ((0, 1), (1, 0), (0, -1), (-1, 0))]
        dfs(sr, sc)
        return image
