package Simple;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/20 - 04 - 20 - 22:52
 * @Description: Simple
 * @version: 1.0
 */
public class _88 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {4, 5, 6};
        merge(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p > 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p] = nums2[p2];
                p2--;
            } else {
                nums1[p] = nums1[p1];
                p1--;
            }
            p--;
        }
        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
    }
}
