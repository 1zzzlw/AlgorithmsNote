package Medium;

import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/23 - 04 - 23 - 20:05
 * @Description: Medium
 * @version: 1.0
 */
public class _74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int r = matrix.length;
        int c = matrix[0].length;

        int left = 0;
        int right = r * c - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            int row = mid / c;
            int col = mid % c;
            if (matrix[row][col] > target) {
                right = mid - 1;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
