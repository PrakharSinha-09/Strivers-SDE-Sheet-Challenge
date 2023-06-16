//https://leetcode.com/problems/search-a-2d-matrix/description/
//the most optimal solution
//intuition
/*
Working on the indexes as if like converting in the 1-D array, though not converting
since, we are not converting, we can't do something like arr[mid], so, to get the position
we have done mid/m to get the row pos. and mid%m to get the column position
and if matrix[mid/m][mid%m]==target means found 
*/

public class SearchinMatrix{

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;

        int low=0;
        int high=n*m-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(matrix[mid/m][mid%m]==target){
                return true;
            }
            
            if(matrix[mid/m][mid%m]>target){
                high=mid-1;
            }

            else{
                low=mid+1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
         int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
         int target = 3;

         boolean ans=searchMatrix(matrix, target);
         System.out.println(ans);
    }
}