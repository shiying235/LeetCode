public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        for (int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == target)
                return true;
            else if(matrix[i][0] < target)
                row = i;
            else break;
        }
        int start = 0;
        int end = matrix[row].length - 1;
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if(matrix[row][mid] == target)
                return true;
            else if(matrix[row][mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(matrix[row][start] == target || matrix[row][end] == target)
            return true;
        return false;
    }
}