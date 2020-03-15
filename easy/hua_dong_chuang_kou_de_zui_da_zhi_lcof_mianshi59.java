package easy;

/**
 * @author 喻浩
 * @create 2020-03-15-10:59
 */
public class hua_dong_chuang_kou_de_zui_da_zhi_lcof_mianshi59 {
    /**
     * question url:https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
     * question context :给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
     */
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || k == 0){
                return new int[0];
            }

            if (k == 1){
                return nums;
            }

            int len = nums.length - k + 1;
            int[] ans = new int[len];

            for (int i = 0; i < len; i++) {
                int max = nums[i];
                for (int j = 1; j < k; j++) {
                    if (nums[i+j] > max){
                        max = nums[i+j];
                    }
                }
                ans[i] = max;
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        hua_dong_chuang_kou_de_zui_da_zhi_lcof_mianshi59 hua_dong_chuang_kou_de_zui_da_zhi_lcof_mianshi59 = new hua_dong_chuang_kou_de_zui_da_zhi_lcof_mianshi59();
        System.out.println(hua_dong_chuang_kou_de_zui_da_zhi_lcof_mianshi59.new Solution());;
    }
}
