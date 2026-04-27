package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/27 - 04 - 27 - 17:16
 * @Description: Medium
 * @version: 1.0
 */
public class _494 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 1};
        findTargetSumWays(nums, 4);
    }

    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        // left 是前面是 + 的集合，right 是前面是 - 的集合
        if ((target + sum) % 2 != 0) {
            return 0;
        }
        int left = (target + sum) / 2;
        int[] dp = new int[left + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = left; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[left];
    }
}
