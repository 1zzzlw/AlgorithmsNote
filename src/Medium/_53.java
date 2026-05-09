package Medium;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/8 - 05 - 08 - 10:41
 * @Description: Medium
 * @version: 1.0
 */
public class _53 {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
        int currSum = nums[0], maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], nums[i] + currSum);

            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
