package Basic.Sort;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/20 - 04 - 20 - 19:37
 * @Description: Basic.Sort
 * @version: 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 9, 8, 1, 4, 13, 324, 42, 1, 3, 4, 5, 24, 7, 5, 375, 222, 131, 4, 1231, 76, 4, 64, 74,
                34, 67, 86, 97, 23, 123, 22, 42, 24, 42, 2, 435, 242, 424, 24, 242, 42, 4, 645, 56, 86, 43, 14, 24,
                23234, 236, 567, 2,
                3321, 4235, 43534, 23, 423423, 423, 575, 34645, 7658, 45, 765, 4224, 234, 23, 364, 5756, 78578, 63, 231,
                23,
                23423, 36, 464, 767, 88, 69,
                8769, 76, 547, 5647, 5647, 6578, 678, 6789, 69, 768, 865, 8654, 765, 7, 658, 678, 68, 987, 987, 9};
        quick(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    /*
     * 单边快排
     * 选择最右元素作为基准点
     * j指针负责找到比基准点小的元素，一旦找到则与i进行交换
     * i指针负责维护小于基准点元素的边界，也是每次交换的目标索引
     * 最后基准点与i交换，i即为分区位置
     */
    public static int position(int[] arr, int start, int last) {
        // 最右侧元素为基准点
        int p = arr[last];
        int i = start;
        for (int j = start; j < last; j++) {
            if (arr[j] < p) {
                // 如果j指向的元素小于基准点，交换j和i
                if (i != j) {
                    swap(arr, i, j);
                }
                i++;
            }
        }
        // 最后，交换i和基准点的位置，i为新的基准点
        if (i != last) {
            swap(arr, i, last);
        }
        return i;
    }

    public static void quick(int[] arr, int start, int last) {
        if (start >= last) {
            return;
        }
        int p = partition(arr, start, last);
        // 左分区递归
        quick(arr, start, p - 1);
        // 右分区递归
        quick(arr, p + 1, last);
    }

    /*
     * 双边快排
     * 选择最左元素为基准点
     * j指针负责从右向左找比基准点小的元素，i指针负责从左向右找比基准点大的元素，一旦找到二者交换，直至i，j相交
     * 最后基准点与i交换，i即为分区位置
     */
    public static int partition(int[] arr, int start, int last) {
        // 最左侧元素为基准点
        int p = arr[start];
        int i = start;
        int j = last;
        while (i < j) {
            // 如果 j 大于基准点，就减1直到找到大于基准点的索引位置
            while (i < j && arr[j] > p) {
                j--;
            }

            // 如果 i 小于基准点，就加1直到找到大于基准点的索引位置
            while (i < j && arr[i] <= p) {
                i++;
            }
            swap(arr, i, j);
        }
        // 最后交换 i 或者 j 与基准点的位置
        swap(arr, i, start);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
