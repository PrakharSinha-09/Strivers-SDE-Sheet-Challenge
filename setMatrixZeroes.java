//https://www.codingninjas.com/codestudio/problems/set-matrix-zeros_8230862?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.Arrays;
class setMatrixZeroes{

    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int[] row=new int[matrix.length];
        int[] col=new int[matrix[0].length];

        Arrays.fill(row,1);
        Arrays.fill(col,1);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==0 || col[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{7,19,3},{4,21,0}};
        setZeros(matrix);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}