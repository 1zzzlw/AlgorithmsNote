package Medium;

import java.util.*;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/13 - 05 - 13 - 21:52
 * @Description: Medium
 * @version: 1.0
 */
public class _207 {
    public static void main(String[] args) {
        int[][] edges = {
                {1, 0},   // 0 → 1
                {2, 1},   // 1 → 2
                {3, 2},   // 2 → 3
                {4, 3}    // 3 → 4
        };

        System.out.println(canFinish(5, edges));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // 每个节点的入度统计
        int[] indegree = new int[numCourses];
        // 图
        Map<Integer, List<Integer>> g = new HashMap<>();
        // 创建邻接表
        for (int i = 0; i < prerequisites.length; i++) {
            if (g.get(prerequisites[i][1]) == null) {
                g.put(prerequisites[i][1], new ArrayList<>(List.of(prerequisites[i][0])));
            } else {
                g.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }
            // 入度加1
            indegree[prerequisites[i][0]]++;
        }

        System.out.println(Arrays.toString(indegree));
        System.out.println(g);

        // 根据拓扑排序，判断是否存在环
        Queue<Integer> queue = new ArrayDeque<>();
        int count = 0;
        // 先把入度为0的节点放入队列里面
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
                count++;
            }
        }

        while (!queue.isEmpty()) {
            int i = queue.poll();
            List<Integer> list = g.get(i);
            if (list == null) {
                continue;
            }
            for (int n = 0; n < list.size(); n++) {
                int index = list.get(n);
                indegree[index]--;
                if (indegree[index] == 0) {
                    queue.add(index);
                    count++;
                }
            }
        }

        return count == numCourses;
    }
}
