package Medium;

import java.util.Arrays;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/27 - 04 - 27 - 16:33
 * @Description: Medium
 * @version: 1.0
 */
public class _1049 {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeightII(stones));
    }

    public static int lastStoneWeightII(int[] stones) {
        int sum = 0;
        int l = stones.length;
        for (int i = 0; i < l; i++) {
            sum += stones[i];
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < l; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        System.out.println(Arrays.toString(dp));
        return sum - dp[target] - dp[target];
    }
}
