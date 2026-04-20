package Medium;

import java.util.*;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/29 - 03 - 29 - 15:45
 * @Description: Medium
 * @version: 1.0
 */
public class _40 {
    public static void main(String[] args) {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        // int[] candidates = new int[]{1, 2};
        int target = 8;
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0);
        System.out.println(new ArrayList<>(result));
    }

    static Set<List<Integer>> result = new HashSet<>();
    static List<Integer> path = new ArrayList<>();

    public static void backtracking(int[] candidates, int target, int sum, int startIndex) {
        if (sum > target) {
            return;
        }
        if (target == sum) {
            result.add(new ArrayList<>(path.stream().sorted().toList()));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            sum += candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, sum, i + 1);
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
