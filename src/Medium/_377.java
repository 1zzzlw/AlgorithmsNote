package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/19 - 05 - 19 - 21:37
 * @Description: Medium
 * @version: 1.0
 */
public class _377 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        combinationSum4(nums, 4);
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int n : nums) {
                if (i >= n) {
                    dp[i] += dp[i - n];
                }
            }
        }
        System.out.println(Arrays.toString(dp));

        return dp[target];
    }
}
