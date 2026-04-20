package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/28 - 03 - 28 - 13:02
 * @Description: Medium
 * @version: 1.0
 */
// 所有可能的路径
public class _797 {
    public static void main(String[] args) {
        int[][] graph = new int[][]{{1, 2}, {3}, {3}, {}};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int end = graph.length - 1;
        dps(graph, path, 0, end, result);
        System.out.println(result);
    }

    // 深度优先搜索
    public static void dps(int[][] graph, List<Integer> visited, int start, int end, List<List<Integer>> result) {
        visited.add(start);
        if (start == end) {
            result.add(new ArrayList<>(visited));
        }
        for (int c : graph[start]) {
            if (!visited.contains(c)) {
                dps(graph, visited, c, end, result);
                visited.removeLast();
            }
        }
    }
}
