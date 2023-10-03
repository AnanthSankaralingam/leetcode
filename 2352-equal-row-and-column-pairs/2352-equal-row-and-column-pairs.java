class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;

        //Track frequency of every row
        Map<String, Integer> rowCount = new HashMap<>();
        for(int[] row: grid){
            String rowStr = Arrays.toString(row);//for efficiency use arrays to string
            rowCount.put(rowStr,1+rowCount.getOrDefault(rowStr, 0));
        }

        //Add frequency of every column
        for(int c=0; c<n; c++){
            int[] colArray = new int[n];
            for(int r=0; r<n; r++){
                colArray[r] = grid[r][c];
            }
            count += rowCount.getOrDefault(Arrays.toString(colArray), 0);
        }
        return count;
    }
}
