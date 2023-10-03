class Solution {
    public boolean isValidSudoku(char[][] board) {
        //checking duplicates - use sets
        Set<Character> rowSet = new HashSet<>();
        Set<Character> colSet = new HashSet<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                char rowChar = board[i][j];
                char colChar = board[j][i];
                if(rowSet.contains(rowChar)){
                    return false;
                }else if(rowChar != '.'){
                    rowSet.add(rowChar);
                }
                if(colSet.contains(colChar)){
                    return false;
                }else if(colChar != '.'){
                    colSet.add(colChar);
                }
            }
            rowSet.clear();
            colSet.clear();
        }
        for(int i=0;i <=6; i+=3){
            for(int j=0; j<=6; j+=3){
                if(!gridCheck(board,i,j)) 
                    return false;
            }
        }
        return true;
    }
    public boolean gridCheck(char[][] board, int startRow, int startCol){
        //When checking grids, we only need one set
        Set<Character> set = new HashSet<>();
        for(int i=startRow; i<startRow+3; i++){
            for(int j=startCol; j<startCol+3; j++){
                char c = board[i][j];
                if(set.contains(c)){
                    return false;
                }else if(c != '.'){
                    set.add(c);
                }
            }
            
        }
        return true;
    }
}