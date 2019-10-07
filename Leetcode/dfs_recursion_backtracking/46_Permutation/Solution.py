class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        def dfs(nums, visited, temp):
            if all(visited):
                res.append(temp)
            for i in range(len(nums)):
                if visited[i]:
                    continue
                visited[i] = True
                dfs(nums, visited, temp+[nums[i]])
                visited[i] = False
        visited = [False for _ in range(len(nums))]
        res = []
        dfs(nums, visited, [])
        return res
