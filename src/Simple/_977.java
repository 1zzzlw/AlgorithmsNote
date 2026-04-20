package Simple;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/18 - 04 - 18 - 10:28
 * @Description: Simple
 * @version: 1.0
 */
public class _977 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            nums[i] = n * n;
        }

        Arrays.sort(nums);
        return nums;
    }
}
