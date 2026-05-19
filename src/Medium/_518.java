package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/19 - 05 - 19 - 21:31
 * @Description: Medium
 * @version: 1.0
 */
public class _518 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        change(5, coins);
    }

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }
}
