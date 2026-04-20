package Basic.Search;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/13 - 03 - 13 - 17:50
 * @Description: Basic.Search
 * @version: 1.0
 */
// 二分查找（折半查找）的使用前提是数组有序
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 11, 14, 16, 18, 23, 49, 56, 60, 70, 100};
        int index = binarySearch3(arr, 56);
        System.out.println("目标值的索引为：" + index);
    }

    /**
     * 标准写法
     */
    public static int binarySearch1(int[] arr, int target) {
        // 左边界
        int left = 0;
        // 右边界
        int right = arr.length - 1;
        // 求得中间值
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target > arr[mid]) {
                // 目标值在mid的右侧
                left = mid + 1;
            } else if (target < arr[mid]) {
                // 目标值在mid的左侧
                right = mid - 1;
            } else {
                // 此时目标值和mid相等
                return mid;
            }
        }
        return -1;
    }

    /**
     * 解决整数溢出的问题
     */
    public static int binarySearch2(int[] arr, int target) {
        int left = 0, right = arr.length - 1, m;
        while (left <= right) {
            // 右移一位
            m = (left + right) >> 1;
            if (target > arr[m]) {
                left = m + 1;
            } else if (target < arr[m]) {
                right = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 二分查找的改动版，关于边界问题
     */
    public static int binarySearch3(int[] arr, int target) {
        // 这里的right只是作为边界，不能作为查找的目标
        int left = 0, right = arr.length, m;
        while (left < right) {
            // 右移一位
            m = (left + right) >> 1;
            if (target > arr[m]) {
                left = m + 1;
            } else if (target < arr[m]) {
                right = m;
            } else {
                return m;
            }
        }
        return -1;
    }
}
