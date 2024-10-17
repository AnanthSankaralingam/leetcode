class Solution {
    public int numIslands(char[][] grid) {
        //BFS since adj - no adj list, just modify grid
        int res = 0;
        for(int i =0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    bfs(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
    public void bfs(char[][] grid, int i, int j){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]=='0')
            return;
        //visit
        grid[i][j] = '0';
        //visit neighbors
        bfs(grid, i-1, j);
        bfs(grid, i+1, j);
        bfs(grid, i, j+1);
        bfs(grid, i, j-1);
    }
}
