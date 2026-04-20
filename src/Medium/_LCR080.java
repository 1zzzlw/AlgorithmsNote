package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/29 - 03 - 29 - 11:47
 * @Description: Medium
 * @version: 1.0
 */
// 组合(回溯算法)
public class _LCR080 {
    public static void main(String[] args) {

    }

    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();


    public static void backtracking(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < n; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.removeLast();
        }
    }
}
