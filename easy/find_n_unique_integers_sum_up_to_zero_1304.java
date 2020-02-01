package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-01-16:21
 */
public class find_n_unique_integers_sum_up_to_zero_1304 {
    /**
     * question url:https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/
     * question context :
     * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
     */
    class Solution {
        public int[] sumZero(int n) {
            int[] nums = new int[n];
            for (int i = 1;i <= n/2;i++){
                nums[i-1] = -i;
                nums[n-i] = i;
            }
            return nums;
        }
    }
    
    public static void main(String[] args) {
        find_n_unique_integers_sum_up_to_zero_1304 find_n_unique_integers_sum_up_to_zero_1304 = new find_n_unique_integers_sum_up_to_zero_1304();
        System.out.println(Arrays.toString(find_n_unique_integers_sum_up_to_zero_1304.new Solution().sumZero(2)));
    }
}
