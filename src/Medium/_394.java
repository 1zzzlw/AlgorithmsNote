package Medium;

import java.util.Objects;
import java.util.Stack;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/14 - 05 - 14 - 21:11
 * @Description: Medium
 * @version: 1.0
 */
public class _394 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));
            if (!ch.equals("]")) {
                // 入栈
                stack.push(ch);
            } else {
                // 出栈，直到看到 [ 为止，在 [] 内的都是字母
                StringBuilder temp = new StringBuilder();
                while (!Objects.equals(stack.peek(), "[")) {
                    String c = stack.pop();
                    temp.append(c);
                }
                // 将 [ 出栈
                stack.pop();
                // 继续出栈，拿到数字
                StringBuilder num = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    String c = stack.pop();
                    num.append(c);
                }

                StringBuilder str = new StringBuilder();
                int count = Integer.parseInt(num.reverse().toString());
                while (count != 0) {
                    str.append(temp);
                    count--;
                }
                stack.push(str.toString());
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
