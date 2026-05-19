package Difficulty;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/17 - 05 - 17 - 15:57
 * @Description: Difficulty
 * @version: 1.0
 */
public class _174 {
    public static void main(String[] args) {
        int[][] dungeon = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        // int[][] dungeon = {{0}};
        calculateMinimumHP(dungeon);
    }

    public static int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int col = dungeon[0].length;

        int[][] dp = new int[row][col];

        dp[row - 1][col - 1] = Math.max(1, 1 - dungeon[row - 1][col - 1]);

        for (int i = row - 2; i >= 0; i--) {
            dp[i][col - 1] = Math.max(1, dp[i + 1][col - 1] - dungeon[i][col - 1]);
        }

        for (int j = col - 2; j >= 0; j--) {
            dp[row - 1][j] = Math.max(1, dp[row - 1][j + 1] - dungeon[row - 1][j]);
        }

        for (int i = row - 2; i >= 0; i--) {
            for (int j = col - 2; j >= 0; j--) {
                dp[i][j] = Math.max(Math.min(dp[i][j + 1], dp[i + 1][j]) - dungeon[i][j], 1);
            }
        }

        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[0][0];
    }
}
