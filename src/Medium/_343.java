package Medium;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/25 - 04 - 25 - 22:32
 * @Description: Medium
 * @version: 1.0
 */
public class _343 {
    public static void main(String[] args) {

    }

    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i / 2; i++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
