public class SudokuSolver {
    public static void solveSudoku(char[][] board){
        solve(board);
    }

    public static boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){

                if(board[i][j]=='.'){

                    for(char c='1';c<='9';c++)
                    {
                        if(isValid(board,i,j,c)){
                            board[i][j]=c;

                            if(solve(board)==true)
                            {
                                return true;
                            }

                            else{
                                board[i][j]='.';
                                // return false;
                            }
                        }
                    }
                    return false;   //if all the 9 characters cannot be filled onto a particular cell, then also return false as we cannotfill, and false returned we have to backtrack the changes we have made while coming down... Obviously!
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i]==c){
                return false;
            }

            if(board[i][col]==c){
                return false;
            }

            if(board[3*(row/3) + i/3][3*(col/3) + i%3]==c){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        char[][] board={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        solve(board);

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
