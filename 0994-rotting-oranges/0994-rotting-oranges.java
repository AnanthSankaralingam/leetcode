class Solution {
    public int orangesRotting(int[][] grid) {
        //graph - BFS to infect
        //oranges get infected simultaneously if multiple rotten ones
        int minutes = 0, fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j});
                } else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int a = 0; a < len; a++){
                int[] curr = queue.poll();
                int i = curr[0], j = curr[1];
                //visit neighbors
                for(int[] dir : directions){
                    int ni = i + dir[0];
                    int nj = j + dir[1];
                    if(inBounds(ni, nj, grid) && grid[ni][nj] == 1){
                        queue.offer(new int[]{ni, nj});
                        grid[ni][nj] = 2; //mark visited
                        fresh--;
                    }
                }
            }
            if(!queue.isEmpty()) minutes++;
        }
        return fresh != 0 ? -1 : minutes;
    }
    
    public boolean inBounds(int i, int j, int[][] grid){
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length;
    }
}