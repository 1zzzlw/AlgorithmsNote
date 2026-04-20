package Basic.Sort;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/14 - 03 - 14 - 14:36
 * @Description: Basic.Sort
 * @version: 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {21, 13, 14, 17, 43, 34, 23, 56, 42, 67, 32, 56, 43, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void selection(int[] arr) {
        // 第一轮循环的i就是目标的最小值的索引
        for (int i = 0; i < arr.length - 1; i++) {
            int currMin = i;
            for (int j = currMin + 1; j < arr.length; j++) {
                if (arr[currMin] > arr[j]) {
                    currMin = j;
                }
            }
            if (currMin != i) {
                // 不等于本身时交换
                swap(arr, currMin, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
