class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        if not heights or not heights[0]:
            return []

        rows, cols = len(heights), len(heights[0])
        # declare visited sets, only common points returned
        pacific_visited = [[False for _ in range(cols)] for _ in range(rows)]
        atlantic_visited = [[False for _ in range(cols)] for _ in range(rows)]
        res = []

        def dfs(i, j, visited, prev_height):
            # Out of bounds, curr is shorter than prev, or already visited
            if (i < 0 or i >= rows or j < 0 or j >= cols or
                visited[i][j] or heights[i][j] < prev_height):
                return

            visited[i][j] = True

            # Continue DFS in four directions
            dfs(i+1, j, visited, heights[i][j])
            dfs(i-1, j, visited, heights[i][j])
            dfs(i, j+1, visited, heights[i][j])
            dfs(i, j-1, visited, heights[i][j])

        # DFS from all Pacific border cells (top row and left column)
        for i in range(rows):
            dfs(i, 0, pacific_visited, heights[i][0])  # Left column (Pacific)
            dfs(i, cols - 1, atlantic_visited, heights[i][cols - 1])  # Right column (Atlantic)

        for j in range(cols):
            dfs(0, j, pacific_visited, heights[0][j])  # Top row (Pacific)
            dfs(rows - 1, j, atlantic_visited, heights[rows - 1][j])  # Bottom row (Atlantic)

        # Collect cells that can flow to both oceans
        for i in range(rows):
            for j in range(cols):
                if pacific_visited[i][j] and atlantic_visited[i][j]:
                    res.append([i, j])

        return res
