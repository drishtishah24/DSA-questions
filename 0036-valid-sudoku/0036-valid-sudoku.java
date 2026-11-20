class Solution {
    public boolean isSafe(char board[][],int row,int col,char current){
        //column check
        for(int i=0;i<9;i++){
            if(board[i][col]==current){
                return false;
            }
        }
        //row check
        for(int j=0;j<9;j++){
            if(board[row][j]==current){
                return false;
            }
        }
        //grid check
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==current){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char current=board[i][j];
                if(current !='.'){
                   board[i][j]='.'; //temp stored value bcz if any value to be check is placed then isSafe() will always return false as it will also check that value with itself too!
                    boolean safe=isSafe(board,i,j,current);
                    board[i][j]=current;//restores the value
                if(!safe){
                    return false;
                }
                }
                
            }
        }
        return true;
    }
}