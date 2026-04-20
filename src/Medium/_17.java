package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/29 - 03 - 29 - 14:09
 * @Description: Medium
 * @version: 1.0
 */
public class _17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    }

    public static List<String> letterCombinations(String digits) {
        int l = digits.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            int c = digits.charAt(i) - '0';
            switch (c) {
                case 2 -> list = combine(new ArrayList<>(Arrays.asList("a", "b", "c")), list);
                case 3 -> list = combine(new ArrayList<>(Arrays.asList("d", "e", "f")), list);
                case 4 -> list = combine(new ArrayList<>(Arrays.asList("g", "h", "i")), list);
                case 5 -> list = combine(new ArrayList<>(Arrays.asList("j", "k", "l")), list);
                case 6 -> list = combine(new ArrayList<>(Arrays.asList("m", "n", "o")), list);
                case 7 -> list = combine(new ArrayList<>(Arrays.asList("p", "q", "r", "s")), list);
                case 8 -> list = combine(new ArrayList<>(Arrays.asList("t", "u", "v")), list);
                case 9 -> list = combine(new ArrayList<>(Arrays.asList("w", "x", "y", "z")), list);
            }
        }
        return list;
    }

    public static List<String> combine(List<String> newList, List<String> oldList) {
        if (oldList.size() == 0) {
            return newList;
        } else {
            List<String> combineList = new ArrayList<>();
            for (String s1 : oldList) {
                for (String s2 : newList) {
                    String combo = s1 + s2;
                    combineList.add(combo);
                }
            }
            return combineList;
        }
    }
}