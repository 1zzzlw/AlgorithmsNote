package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/19 - 05 - 19 - 22:06
 * @Description: Medium
 * @version: 1.0
 */
public class _279 {
    public static void main(String[] args) {
        numSquares(12);
    }

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        // 遍历背包容量
        for (int i = 0; i <= n; i++) {
            // 遍历物品，并筛选出完全平方数
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
