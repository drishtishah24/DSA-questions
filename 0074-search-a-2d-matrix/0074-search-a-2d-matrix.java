class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // //staircase search with O(n+m)
        // int row=0;
        // int col=matrix.length-1;
        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col]==target){
        //         return true;
        //     }
        //     else if(target<matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
            
        // }
        // return false;

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int low = 0;
        int high = rows * cols - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Map the 1D index back to 2D coordinates
            int midValue = matrix[mid / cols][mid % cols];
            
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return false;
    }
    
}