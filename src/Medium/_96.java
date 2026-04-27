package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/26 - 04 - 26 - 14:29
 * @Description: Medium
 * @version: 1.0
 */
public class _96 {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }

    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
