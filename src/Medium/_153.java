package Medium;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/29 - 04 - 29 - 22:41
 * @Description: Medium
 * @version: 1.0
 */
public class _153 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        findMin(nums);
    }


    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            // 说明此时mid肯定在左侧
            if (nums[left] < nums[mid]) {
                left = mid + 1;
            }
            if (nums[right] >= nums[mid]) {
                right = mid - 1;
            }
            if (right == left) {
                return nums[left];
            }
        }
        return nums[left];
    }
}
