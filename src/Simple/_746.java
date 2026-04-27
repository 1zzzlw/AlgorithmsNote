package Simple;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/25 - 04 - 25 - 21:18
 * @Description: Simple
 * @version: 1.0
 */
public class _746 {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int l = cost.length;
        int[] dp = new int[l + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= l; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[l];
    }
}
