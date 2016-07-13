public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int column = 0;
        while(row >= 0 && column <= matrix[0].length - 1){
            if(matrix[row][column] == target){
                return true;
            }
            else if(matrix[row][column] > target){
                row --;
            }
            else{
                column ++;
            }
        }
        return false;
    }
}