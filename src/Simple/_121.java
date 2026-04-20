package Simple;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/27 - 03 - 27 - 13:39
 * @Description: Simple
 * @version: 1.0
 */
public class _121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
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
}
