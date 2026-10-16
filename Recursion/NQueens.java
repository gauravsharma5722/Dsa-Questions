public class NQueens {
    public static void main(String[] args) {
        int n = 4; // Change this value to test with different board sizes
        solveNQueens(n);
    }

    static void solveNQueens(int n){
        int[][] board=new int[n][n];
        solve(board,0);


    }
    static void solve(int[][] board,int col){
        if(col>=board.length){
            printBoard(board);
            return ;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,i,col)){
                board[i][col]=1;
                solve(board,col+1);
                   
                board[i][col]=0; // backtrack
            }
        }
        return;
    
    }
    static void printBoard(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board,int row,int col){
        for(int i=0;i<col;i++){  //row check
            if(board[row][i]==1){
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){  //upper diagonal check
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row,j=col;j>=0 && i<board.length;i++,j--){ //lower diagonal check
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
}
