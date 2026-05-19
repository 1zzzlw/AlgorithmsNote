package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/19 - 05 - 19 - 21:46
 * @Description: Medium
 * @version: 1.0
 */
public class _322 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        coinChange(coins, 11);
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        if (dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}
