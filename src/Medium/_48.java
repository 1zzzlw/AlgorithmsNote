package Medium;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/10 - 05 - 10 - 14:51
 * @Description: Medium
 * @version: 1.0
 */
public class _48 {
    public static void main(String[] args) {

    }

    // 旋转图像
    public static void rotate(int[][] matrix) {
        int l = matrix.length;
        // 需要旋转的圈数
        int k = l / 2;

        /*
         * 1 -> 3 -> 9 -> 7  (0, 0) -> (0, 2) -> (2, 2) -> (2, 0)
         * 2 -> 6 -> 8 -> 4  (0, 1) -> (1, 2) -> (2, 1) -> (1, 0)
         *
         * (i, j) -> (j, l - 1 - i)
         *
         * a -> b -> c -> d
         *
         * temp = a
         * a = d
         * d = c
         * c = b
         * b = temp
         *
         * a -> b
         * b -> c
         * c -> d
         * d -> a
         *
         * */
        for (int i = 0; i < k; i++) {
            /*
             *       l = 4 时               l = 3 时
             * 第 0 圈：(0, 0) -> (0, 3) 或 (0, 0) -> (0, 2)
             *
             * */
            for (int j = i; j < l - 1 - i; j++) {
                // (i, j) -> (j, l - 1 - i) -> (l - 1 - i, l - 1 - j) -> (l - 1 - j, i)
                int temp = matrix[i][j];
                // a = d
                matrix[i][j] = matrix[l - 1 - j][i];
                // d = c
                matrix[l - 1 - j][i] = matrix[l - 1 - i][l - 1 - j];
                // c = b
                matrix[l - 1 - i][l - 1 - j] = matrix[j][l - 1 - i];
                // b = a
                matrix[j][l - 1 - i] = temp;
            }
        }
    }

}
