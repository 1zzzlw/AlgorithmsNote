package Medium;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/23 - 04 - 23 - 21:13
 * @Description: Medium
 * @version: 1.0
 */
public class _33 {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) {
                return mid;
            }
            // 可以将数组分为两段，左侧最小值大于右侧最大值
            if (nums[mid] >= nums[left]) {
                // 如果中间索引的值大于左侧的最小值，说明此时在左侧
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // 右半段有序
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return -1;
    }
}
