package Medium;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/29 - 03 - 29 - 17:14
 * @Description: Medium
 * @version: 1.0
 */
public class _560 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prevSum = 0;
        map.merge(prevSum, 1, Integer::sum);
        Queue<Integer> queue = new ArrayDeque<>();
    }
}
