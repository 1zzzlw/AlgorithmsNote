package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/10 - 05 - 10 - 14:04
 * @Description: Medium
 * @version: 1.0
 */
public class _73 {
    public static void main(String[] args) {
        int[][] mateix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        // int[][] mateix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(mateix);
        for (int i = 0; i < mateix.length; i++) {
            System.out.println(Arrays.toString(mateix[i]));
        }
    }

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean firstRowIsZero = false;
        boolean firstColIsZero = false;

        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == 0) {
                firstRowIsZero = true;
                break;
            }
        }

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                firstColIsZero = true;
                break;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < col; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < row; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if (firstRowIsZero) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstColIsZero) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
