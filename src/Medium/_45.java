package Medium;

/**
 * @Auther: zzzlew
 * @Date: 2026/5/7 - 05 - 07 - 23:00
 * @Description: Medium
 * @version: 1.0
 */
public class _45 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int count = 0;
        int cover = 0;
        int end = 0;
        int l = nums.length;
        if (l == 1) {
            return 0;
        }
        for (int i = 0; i < l - 1; i++) {
            cover = Math.max(i + nums[i], cover);

            // 走到当前区间末尾，必须跳一次
            if (i == end) {
                if (i != l - 1) {
                    end = cover;
                    count++;
                    if (end >= l - 1) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
