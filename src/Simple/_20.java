package Simple;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/29 - 04 - 29 - 22:55
 * @Description: Simple
 * @version: 1.0
 */
public class _20 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        int min = Integer.MIN_VALUE;

    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' -> stack.push(')');
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                case ')', '}', ']' -> {
                    if (stack.pop() != c || stack.isEmpty()) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
