class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }       
        nQueens(board,0,ans);
        return ans;
    }
     
     public static void nQueens(char[][] board,int row, List<List<String>> ans){
        //base case
        if(row==board.length){
            ans.add(printBoard(board));
            return;
        }

        //recursion, backtracking
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1,ans);
                board[row][j]='.';
            }
        }
     }
    public static boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal up left
        for(int i=row-1, j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal up right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
    return true;
    }
    public static List<String> printBoard(char board[][]){
        List<String> list=new ArrayList<>();

        for(int i=0;i<board.length;i++){
            list.add(new String(board[i]));
        }
        return list;
    }
    
}

//time complexity =O(n!)