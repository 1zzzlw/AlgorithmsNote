package Simple;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/27 - 03 - 27 - 13:39
 * @Description: Simple
 * @version: 1.0
 */
public class _121 {
    public static void main(String[] args) {
        System.out.println(maxProfit2(new int[]{7, 1, 5, 3, 6, 4}));
    }

    // 贪心算法
    public static int maxProfit1(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            // 计算最低成本
            cost = Math.min(prices[i], cost);
            // 计算最大利润
            profit = Math.max(profit, prices[i] - cost);
        }
        return profit;
    }

    // 动态规划
    public static int maxProfit2(int[] prices) {
        int l = prices.length;
        if (l == 1) {
            return 0;
        }
        // 需要有两种状态来判断，什么是买入，什么是卖出
        // 这里的 dp[i][j] 数组的含义
        // i 表示第几日，j 表示买入和卖出的状态
        // dp[i][0] 就表示买入的时候，收益状态最好的
        // dp[i][1] 就表示卖出的时候，收益状态最好的
        int[][] dp = new int[l][2];
        // 初始化，第1天的时候，持有股票时的收益状态
        dp[0][0] = -prices[0];
        // 第1天，不持有股票时的收益状态
        dp[0][1] = 0;
        for (int i = 1; i < l; i++) {
            // 记录每日非持有股票时的收益状态，一般都为负数，找到收益状态最好的一个。
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);

            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        }

        return dp[l - 1][1];
    }
}
