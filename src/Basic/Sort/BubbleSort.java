package Basic.Sort;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/14 - 03 - 14 - 13:31
 * @Description: Basic.Sort
 * @version: 1.0
 */
// 冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = {21, 13, 14, 17, 43, 34, 23, 56, 42, 67, 32, 56, 43, 1};
        // int[] arr = {1, 13, 14, 17, 21, 23, 32, 34, 42, 43, 43, 56, 56, 67};
        int[] arr = {5, 3, 7, 2, 9, 8, 1, 4, 13, 324, 42, 1, 3, 4, 5, 24, 7, 5, 375, 222, 131, 4, 1231, 76, 4, 64, 74,
                34, 67, 86, 97, 23, 123, 22, 42, 24, 42, 2, 435, 242, 424, 24, 242, 42, 4, 645, 56, 86, 43, 14, 24,
                23234, 236, 567, 2,
                3321, 4235, 43534, 23, 423423, 423, 575, 34645, 7658, 45, 765, 4224, 234, 23, 364, 5756, 78578, 63, 231,
                23,
                23423, 36, 464, 767, 88, 69,
                8769, 76, 547, 5647, 5647, 6578, 678, 6789, 69, 768, 865, 8654, 765, 7, 658, 678, 68, 987, 987, 9};
        bubble4(arr);
        // System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序的基础实现
     *
     */
    public static void bubble1(int[] arr) {
        // 第一轮循环是比较的次数
        for (int i = 0; i < arr.length - 1; i++) {
            // 第二轮循环就是一轮循环需要经过多少次比较
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 减少比较次数
     *
     */
    public static void bubble2(int[] arr) {
        // 第一轮循环是比较的次数
        for (int i = 0; i < arr.length - 1; i++) {
            // 第二轮循环就是一轮循环需要经过多少次比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("第" + j + "次比较");
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println("第" + i + "轮冒泡");
            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * 减少冒泡次数
     *
     */
    public static void bubble3(int[] arr) {
        // 第一轮循环是比较的次数
        for (int i = 0; i < arr.length - 1; i++) {
            // 是否发生了交换，如果没有发生交换，说明此时已经排序了，直接退出循环
            boolean isSwap = false;
            // 第二轮循环就是一轮循环需要经过多少次比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("第" + j + "次比较");
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwap = true;
                }
            }
            System.out.println("第" + i + "轮冒泡");
            System.out.println(Arrays.toString(arr));
            if (!isSwap) {
                break;
            }
        }
    }

    /**
     * 记录最后一次比较的索引位置，进一步减少比较次数
     *
     */
    public static void bubble4(int[] arr) {
        int n = arr.length - 1;
        // 没有发生比较，说明已经排序完成，直接退出
        do {
            int last = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("第" + i + "次比较");
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    last = i;
                }
            }
            n = last;
            System.out.println(Arrays.toString(arr));
        } while (n != 0);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
