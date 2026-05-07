package Simple;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/7 - 05 - 07 - 22:25
 * @Description: Simple
 * @version: 1.0
 */
public class _122 {
    public static void main(String[] args) {

    }

    // 动态规划
    public static int maxProfit(int[] prices) {
        int l = prices.length;
        if (l == 1) {
            return 0;
        }
        int[][] dp = new int[l][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < l; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);

            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        }

        return dp[l - 1][1];
    }
}
