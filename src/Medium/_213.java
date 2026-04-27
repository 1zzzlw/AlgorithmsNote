package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/26 - 04 - 26 - 15:39
 * @Description: Medium
 * @version: 1.0
 */
public class _213 {
    public static void main(String[] args) {
        int[] nums = {0};
        rob(nums);
    }

    public static int rob(int[] nums) {
        int l = nums.length;
        if (l == 1) {
            return nums[0];
        }
        int[] arr1 = new int[l - 1];
        int[] arr2 = new int[l - 1];
        System.arraycopy(nums, 0, arr1, 0, l - 1);
        System.arraycopy(nums, 1, arr2, 0, l - 1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        return Math.max(rob1(arr1), rob1(arr2));
    }

    public static int rob1(int[] nums) {
        int l = nums.length;
        if (l == 1) {
            return nums[0];
        }
        int[] dp = new int[l];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < l; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[l - 1];
    }
}
