package Medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/26 - 03 - 26 - 22:55
 * @Description: Medium
 * @version: 1.0
 */
public class _739Temperature {
    public static void main(String[] args) {
        // int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperatures = new int[]{55, 38, 53, 81, 61, 93, 97, 32, 43, 78};
        int[] arr = dailyTemperatures2(temperatures);
        System.out.println(Arrays.toString(arr));
    }

    // 超时了
    public static int[] dailyTemperatures1(int[] temperatures) {
        int length = temperatures.length;
        int[] result = new int[length];
        int size = 0;
        int curr;
        for (int i = 0; i < length; i++) {
            curr = temperatures[i];
            size = 0;
            size++;
            for (int j = i + 1; j < length; j++) {
                if (temperatures[j] > curr) {
                    result[i] = size;
                    break;
                } else {
                    size++;
                }
            }
        }
        return result;
    }

    // 使用单调栈的思路
    public static int[] dailyTemperatures2(int[] temperatures) {
        int length = temperatures.length;
        int[] result = new int[length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
