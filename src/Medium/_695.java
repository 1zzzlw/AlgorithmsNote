package Medium;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/28 - 03 - 28 - 15:55
 * @Description: Medium
 * @version: 1.0
 */
// 岛屿的最大面积
public class _695 {

    static int[][] computed = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    static int newMax = 0;

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int preMax = 0;
        // 行数
        int r = grid.length;
        // 列数
        int c = grid[0].length;
        int[][] visited = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // 遍历地图，当是陆地并且没有标记时，深度遍历
                if (grid[i][j] == 1 && visited[i][j] != 1) {
                    // 重置最大数量
                    newMax = 1;
                    // 当前位置进行标记
                    visited[i][j] = 1;
                    // 开始探索当前位置
                    DFS(grid, visited, i, j);
                    if (preMax < newMax) {
                        preMax = newMax;
                    }
                }
            }
        }
        System.out.println(preMax);
    }

    public static void DFS(int[][] grid, int[][] visited, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nextX = x + computed[i][0];
            int nextY = y + computed[i][1];
            if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length) {
                continue;
            }
            if (grid[nextX][nextY] == 0 || visited[nextX][nextY] == 1) {
                continue;
            }
            newMax++;
            visited[nextX][nextY] = 1;
            DFS(grid, visited, nextX, nextY);
        }
    }
}
