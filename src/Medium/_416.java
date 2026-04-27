package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/26 - 04 - 26 - 18:28
 * @Description: Medium
 * @version: 1.0
 */
public class _416 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        canPartition(nums);
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < l; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        System.out.println(Arrays.toString(dp));
        if (dp[target] == target) {
            return true;
        } else {
            return false;
        }
    }
}
