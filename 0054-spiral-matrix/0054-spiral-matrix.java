import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1; 

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]); 
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) { 
                if (startRow == endRow) break;
                result.add(matrix[endRow][j]);
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) { 
                if (startCol == endCol) break;
                result.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return result;
    }

    public static void main(String[] args) {
    
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        Solution obj = new Solution();
        List<Integer> ans = obj.spiralOrder(matrix);


        System.out.println(ans);
    }
}


