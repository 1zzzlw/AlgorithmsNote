package face;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/9 - 05 - 09 - 15:59
 * @Description: face
 * @version: 1.0
 */
public class _1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3};
        System.out.println(FindSubarrayWithSum(arr, 3));
    }

    public static int FindSubarrayWithSum(int[] arr, int target) {
        int index = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum > target && index <= i) {
                sum -= arr[index];
                index++;
            }
            if (sum == target) {
                return index;
            }
        }
        return -1;
    }
}
