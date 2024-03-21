class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        //bfs, count iterations
        int max = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    max = Math.max(bfs(i, j, grid), max);
                }
            }
        }
        return max;
    }
    public int bfs(int i, int j, int[][]grid){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0||grid[i][j]!=1){
            return 0;
        }
        //visit current node
        grid[i][j] = 2;
        //visit neighbors
        return 1 + bfs(i+1,j,grid) + bfs(i-1,j,grid)+bfs(i,j+1,grid) + bfs(i,j-1,grid);
    }
}