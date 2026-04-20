package Medium;

import java.util.*;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/28 - 03 - 28 - 11:01
 * @Description: Medium
 * @version: 1.0
 */
public class _15 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        nums = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            HashSet<Integer> map = new HashSet<>();
            for (int j = i + 1; j < l; j++) {
                int target = - nums[i] - nums[j];
                if (map.contains(target)) {
                    List<Integer> list = new ArrayList<>(List.of(nums[i], nums[j], target));
                    Collections.sort(list);
                    result.add(list);
                }
                map.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}
