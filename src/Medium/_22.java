package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 20:34
 * @Description: Medium
 * @version: 1.0
 */
public class _22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }

    static List<String> result = new ArrayList<>();
    static StringBuilder path = new StringBuilder();

    public static List<String> generateParenthesis(int n) {
        backtracking(n, 0, 0);
        return result;
    }

    public static void backtracking(int n, int left, int right) {
        if (left == n && right == n) {
            result.add(path.toString());
            return;
        }
        if (left < n) {
            path.append("(");
            backtracking(n, left + 1, right);
            path.deleteCharAt(path.length() - 1);
        }
        if (right < left) {
            path.append(")");
            backtracking(n, left, right + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
