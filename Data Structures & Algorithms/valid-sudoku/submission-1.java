class Solution {
    public boolean isValidSudoku(char[][] board) {
       List<List<Character>> rowList = new ArrayList<>();
       List<List<Character>> colList = new ArrayList<>();
       List<List<Character>> gridList = new ArrayList<>();
       for(int i=0;i<9;i++){
        rowList.add(new ArrayList<>());
        colList.add(new ArrayList<>());
        gridList.add(new ArrayList<>());
       }
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            int gridNo = (i/3)*3 + j/3;
            if(board[i][j]!='.'){
                boolean row = rowList.get(i).contains(board[i][j]);
                boolean col = colList.get(j).contains(board[i][j]);
                boolean grid = gridList.get(gridNo).contains(board[i][j]);
                if(row||col||grid){
                    return false;
                }
                rowList.get(i).add(board[i][j]);
                colList.get(j).add(board[i][j]);
                gridList.get(gridNo).add(board[i][j]);

            }
        }
       }
       return true;


    }
}
