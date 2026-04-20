package Medium;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/28 - 03 - 28 - 14:14
 * @Description: Medium
 * @version: 1.0
 */
// 岛屿数量
public class _200 {

    // 记录上下左右的计算
    static int[][] computed = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    static Queue<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) {
        char[][] grid = new char[][]{{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int result = 0;
        // 行数
        int r = grid.length;
        // 列数
        int c = grid[0].length;
        int[][] visited = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // 遍历地图，当是陆地并且没有标记时，深度遍历
                if (grid[i][j] == '1' && visited[i][j] != 1) {
                    result++;
                    // 当前位置进行标记
                    visited[i][j] = 1;
                    // 开始探索当前位置
                    BFS(grid, visited, i, j);
                }
            }
        }
        System.out.println(result);
    }

    public static void DFS(char[][] grid, int[][] visited, int i, int j) {
        // 开始深度遍历四周
        for (int n = 0; n < 4; n++) {
            int nextX = i + computed[n][0];
            int nextY = j + computed[n][1];
            // 判断是否超出边界
            if ((nextX < 0 || nextX >= grid.length) || (nextY < 0 || nextY >= grid[0].length)) {
                continue;
            }
            // 判断是海洋还是已标记的陆地
            if (grid[nextX][nextY] == '0' || visited[nextX][nextY] == 1) {
                continue;
            }
            visited[nextX][nextY] = 1;
            DFS(grid, visited, nextX, nextY);
        }
    }

    public static void BFS(char[][] grid, int[][] visited, int x, int y) {
        queue.add(new int[]{x, y});
        visited[x][y] = 1;
        // 出队列
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = curr[0] + computed[i][0];
                int nextY = curr[1] + computed[i][1];
                if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length) {
                    continue;
                }
                if (grid[nextX][nextY] == '0' || visited[nextX][nextY] == 1) {
                    continue;
                }
                queue.add(new int[]{nextX, nextY});
                visited[nextX][nextY] = 1;
            }
        }
    }
}
