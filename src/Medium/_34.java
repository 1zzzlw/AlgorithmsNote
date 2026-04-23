package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/23 - 04 - 23 - 20:17
 * @Description: Medium
 * @version: 1.0
 */
public class _34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] arr = searchRange(nums, 8);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums.length == 0) {
            return result;
        }
        result[0] = leftBinary(nums, target);
        result[1] = rightBinary(nums, target);

        return result;
    }

    public static int leftBinary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }


        }

        if (left >= nums.length || nums[left] != target) {
            return -1;
        }

        return left;
    }

    public static int rightBinary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }


        }

        if (right < 0 || nums[right] != target) {
            return -1;
        }

        return right;
    }
}
