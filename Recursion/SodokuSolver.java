public class SodokuSolver {
    public static void main(String[] args) {
       int[][] board = {
    {5, 3, 0, 0, 7, 0, 0, 0, 0},
    {6, 0, 0, 1, 9, 5, 0, 0, 0},
    {0, 9, 8, 0, 0, 0, 0, 6, 0},
    {8, 0, 0, 0, 6, 0, 0, 0, 3},
    {4, 0, 0, 8, 0, 3, 0, 0, 1},
    {7, 0, 0, 0, 2, 0, 0, 0, 6},
    {0, 6, 0, 0, 0, 0, 2, 8, 0},
    {0, 0, 0, 4, 1, 9, 0, 0, 5},
    {0, 0, 0, 0, 8, 0, 0, 7, 9}
};

        if(sodokusolver( board)){
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
    static boolean sodokusolver(int[][] board){
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==0){
                    for(int num=1;num<=9;num++){
                        if(issafe(board,i,j,num)){
                            board[i][j]=num;
                            if(sodokusolver(board)){
                                return true;
                            }
                            else
                                {board[i][j]=0; }// backtrack
                        }
                         
                    }
                    return false; // return if no number can be placed in the current cell
                }
               
                
            }
        }
    //    printBoard(board);
        return true;  // return true if the board is completely filled
    }
    static boolean issafe(int[][] board,int row,int col,int num){
        // for(int i=0;i<board.length;i++){  //row check
        //     if(board[row][i]==num){
        //         return false;
        //     }
        // }
        // for(int i=0;i<board.length;i++){ //coloumn check
        //     if(board[i][col]==num){
        //         return false;
        //     }
        // }
        // int startRow=row-row%3;
        // int startCol=col-col%3;
        // for(int i=startRow;i<startRow+3;i++){ //3x3 box check
        //     for(int j=startCol;j<startCol+3;j++){
        //         if(board[i][j]==num){
        //             return false;
        //         }
        //     }
        // }

        for(int i=0;i<9;i++)
        {
            
            if(board[row][i]==num){ //row check
                return false;
            }
            if(board[i][col]==num){  //coloumn check
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==num){   //3x3 box check
                return false;
            }
        }
        return true;
    }

    static void printBoard(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
