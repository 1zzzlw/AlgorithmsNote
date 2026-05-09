package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/8 - 05 - 08 - 22:02
 * @Description: Medium
 * @version: 1.0
 */
public class _56 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] arr = merge(intervals);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    // 暴力解法
    public static int[][] merge(int[][] intervals) {
        int l = intervals.length;
        if (l == 1) {
            return intervals;
        }
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] nums = intervals[0];
        int start = nums[0], end = nums[1];
        for (int i = 1; i < l; i++) {
            nums = intervals[i];
            if (end >= nums[0]) {
                end = Math.max(end, nums[1]);
            } else {
                result.add(new int[]{start, end});
                start = nums[0];
                end = nums[1];
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}
