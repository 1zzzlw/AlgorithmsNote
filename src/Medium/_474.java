package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/19 - 05 - 19 - 16:46
 * @Description: Medium
 * @version: 1.0
 */
public class _474 {
    public static void main(String[] args) {
        String[] strings = {"10", "0001", "111001", "1", "0"};

        System.out.println(findMaxForm(strings, 5, 3));
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        // 物品循环
        for (String str : strs) {
            int x = 0, y = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '0') {
                    x++;
                } else {
                    y++;
                }
            }

            // 容量循环
            for (int i = m; i >= x; i--) {
                for (int j = n; j >= y; j--) {
                    dp[i][j] = Math.max(dp[i - x][j - y] + 1, dp[i][j]);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[m][n];
    }
}
