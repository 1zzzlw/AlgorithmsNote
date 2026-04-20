package Basic.Sort;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/20 - 04 - 20 - 23:02
 * @Description: Basic.Sort
 * @version: 1.0
 */
// 归并排序
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 9, 8, 1, 4, 13, 324, 42, 1, 3, 4, 5, 24, 7, 5, 375, 222, 131, 4, 1231, 76, 4, 64, 74,
                34, 67, 86, 97, 23, 123, 22, 42, 5, 3, 24, 42, 2, 435, 242, 424, 24, 242, 42, 4, 645, 56, 86, 43, 14, 24,
                23234, 236, 567, 2,
                3321, 4235, 43534, 23, 423423, 423, 575, 34645, 7658, 45, 765, 4224, 234, 23, 364, 5756, 78578, 63, 231,
                23,
                23423, 36, 464, 767, 88, 69,
                8769, 76, 547, 5647, 5647, 6578, 678, 6789, 69, 768, 865, 8654, 765, 7, 658, 678, 68, 987, 987, 9};
        // 需要创建一个临时数组，用于数组的合并
        int[] temp = new int[arr.length];
        split(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void split(int[] arr1, int left, int right, int[] arr2) {
        int[] array = Arrays.copyOfRange(arr1, left, right + 1);
        System.out.println(Arrays.toString(array));
        if (left == right) {
            return;
        }
        // 找到中间索引
        int mid = (left + right) >> 1;
        split(arr1, left, mid, arr2);
        split(arr1, mid + 1, right, arr2);
        // 需要合并
        merge(arr1, left, mid, right, arr2);
        // 将数组2复制到数组1，需要按照相对位置进行复制
        System.arraycopy(arr2, left, arr1, left, right - left + 1);
    }

    // 合并有序数组
    public static void merge(int[] arr1, int left, int mid, int right, int[] arr2) {
        int p1 = left;
        int p2 = mid + 1;
        int p = left;

        while (p1 <= mid && p2 <= right) {
            if (arr1[p1] < arr1[p2]) {
                arr2[p] = arr1[p1++];
            } else {
                arr2[p] = arr1[p2++];
            }
            p++;
        }

        // 如果左数组有剩余值
        while (p1 <= mid) {
            arr2[p++] = arr1[p1++];
        }

        // 如果右数组有剩余值
        while (p2 <= right) {
            arr2[p++] = arr1[p2++];
        }
    }

}
