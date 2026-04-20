package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/27 - 03 - 27 - 18:55
 * @Description: Medium
 * @version: 1.0
 */
public class _438 {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> anagrams = findAnagrams(s, p);
        System.out.println(anagrams);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        // 滑动窗口
        HashMap<Character, Integer> window = new HashMap<>();
        // 匹配的hash集合
        HashMap<Character, Integer> need_match = new HashMap<>();
        // 先初始化p的hashmap
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            need_match.merge(c, 1, Integer::sum);
        }
        int left = 0;
        int right = 0;
        int match = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            // 如果匹配窗口中包含该字符，并且window的匹配度和他相等，匹配程度加1
            if (need_match.containsKey(c)) {
                window.merge(c, 1, Integer::sum);
                if (Objects.equals(window.get(c), need_match.get(c))) {
                    match++;
                }
            }

            // 开始判断是否需要和p比较
            while (right - left == p.length()) {
                // 先判断一下是否匹配
                if (match == need_match.size()) {
                    result.add(left);
                }
                // 左边界开始移动
                char remove = s.charAt(left);

                if (need_match.containsKey(remove)) {
                    if (Objects.equals(window.get(remove), need_match.get(remove))) {
                        match--;
                    }
                    window.put(remove, window.get(remove) - 1);
                }
                left++;
            }
        }
        return result;
    }

}
