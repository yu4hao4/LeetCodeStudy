import java.util.HashSet;
import java.util.Set;

/**
 * @author 喻浩
 * @create 2020-04-28-15:53
 */
public class shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56_1 {
    /**
     * question url:https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
     * question context :
     * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     */
    class Solution {
        public int[] singleNumbers(int[] nums) {
            if (nums.length == 2 ){
                return nums;
            }

            int[] ans = new int[2];

            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])){
                    set.remove(nums[i]);
                    continue;
                }
                set.add(nums[i]);
            }
            ans[0] = (int) set.toArray()[0];
            ans[1] = (int) set.toArray()[1];
            return ans;
        }
    }

    public static void main(String[] args) {
        shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56_1 shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56_1 = new shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56_1();
        System.out.println(shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_lcof_mianshi56_1.new Solution());;
    }
}
