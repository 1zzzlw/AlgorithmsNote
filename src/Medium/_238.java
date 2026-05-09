package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/9 - 05 - 09 - 16:44
 * @Description: Medium
 * @version: 1.0
 */
public class _238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] result = new int[l];
        int[] temp = new int[l];

        result[0] = 1;
        for (int i = 1; i < l; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        System.out.println(Arrays.toString(result));

        temp[l - 1] = 1;
        for (int i = l - 2; i >= 0; i--) {
            temp[i] = temp[i + 1] * nums[i + 1];
        }
        System.out.println(Arrays.toString(temp));

        for (int i = 0; i < l; i++) {
            result[i] = result[i] * temp[i];
        }
        System.out.println(Arrays.toString(result));

        return result;
    }

}
