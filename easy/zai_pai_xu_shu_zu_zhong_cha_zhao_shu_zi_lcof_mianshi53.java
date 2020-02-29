package easy;

/**
 * @author 喻浩
 * @create 2020-02-27-21:19
 */
public class zai_pai_xu_shu_zu_zhong_cha_zhao_shu_zi_lcof_mianshi53 {
    /**
     * question url:https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
     * question context :
     * 统计一个数字在排序数组中出现的次数。
     */
    class Solution {
        public int search(int[] nums, int target) {
            int result = 0;
            for (int num : nums) {
                if (num > target){
                    break;
                }

                if (num < target){
                    continue;
                }

                result++;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        zai_pai_xu_shu_zu_zhong_cha_zhao_shu_zi_lcof_mianshi53 zai_pai_xu_shu_zu_zhong_cha_zhao_shu_zi_lcof_mianshi53 = new zai_pai_xu_shu_zu_zhong_cha_zhao_shu_zi_lcof_mianshi53();
        System.out.println(zai_pai_xu_shu_zu_zhong_cha_zhao_shu_zi_lcof_mianshi53.new Solution());;
    }
}
