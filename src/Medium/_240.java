package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/10 - 05 - 10 - 15:39
 * @Description: Medium
 * @version: 1.0
 */
public class _240 {
    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        System.out.println(searchMatrix(matrix, -5));

        int[] arr = new int[10];
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int startRow = 0;
        int startCol = matrix[0].length - 1;
        while (startRow < matrix.length && startCol >= 0) {
            if (matrix[startRow][startCol] == target) {
                return true;
            } else if (matrix[startRow][startCol] > target) {
                startCol--;
            } else {
                startRow++;
            }
        }
        return false;
    }
}
