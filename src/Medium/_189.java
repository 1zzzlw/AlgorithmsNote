package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/8 - 05 - 08 - 22:49
 * @Description: Medium
 * @version: 1.0
 */
public class _189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
    }

    public static void rotate(int[] nums, int k) {
        int l = nums.length;
        if (l == 1) {
            return;
        }
        // 防止 k 大于 l
        k %= nums.length;
        reverse(nums, 0, l - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, l - 1);

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
