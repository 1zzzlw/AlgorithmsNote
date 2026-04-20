package Basic.Sort;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/20 - 04 - 20 - 21:07
 * @Description: Basic.Sort
 * @version: 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 9, 8, 1, 4, 13, 324, 42, 1, 3, 4, 5, 24, 7, 5, 375, 222, 131, 4, 1231, 76, 4, 64, 74,
                34, 67, 86, 97, 23, 123, 22, 42, 24, 42, 2, 435, 242, 424, 24, 242, 42, 4, 645, 56, 86, 43, 14, 24,
                23234, 236, 567, 2,
                3321, 4235, 43534, 23, 423423, 423, 575, 34645, 7658, 45, 765, 4224, 234, 23, 364, 5756, 78578, 63, 231,
                23,
                23423, 36, 464, 767, 88, 69,
                8769, 76, 547, 5647, 5647, 6578, 678, 6789, 69, 768, 865, 8654, 765, 7, 658, 678, 68, 987, 987, 9};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int t = arr[i];
            int j = i - 1;
            while (j >= 0) {
                if (t < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
                j--;
            }
            arr[j + 1] = t;
        }
    }
}
