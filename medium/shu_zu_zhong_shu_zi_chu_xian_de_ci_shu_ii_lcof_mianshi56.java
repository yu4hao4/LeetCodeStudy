package medium;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Set;

/**
 * @author 喻浩
 * @create 2020-02-25-18:51
 */
public class shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_ii_lcof_mianshi56 {
    /**
     * question url:https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
     * question context :
     * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字
     */
    class Solution {
        public int singleNumber(int[] nums) {
            if (nums.length < 4){
                return nums[0];
            }

            HashMap<Integer,Boolean> map = new HashMap<>();
            for (int num : nums) {
                if (map.get(num) != null){
                    map.put(num, false);
                }else {
                    map.putIfAbsent(num, true);
                }
                
            }

            for (Integer integer : map.keySet()) {
                if (map.get(integer)){
                    return integer;
                }
            }
            return  -1;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {3,4,3,3};
        shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_ii_lcof_mianshi56 shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_ii_lcof_mianshi56 = new shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_ii_lcof_mianshi56();
        System.out.println(shu_zu_zhong_shu_zi_chu_xian_de_ci_shu_ii_lcof_mianshi56.new Solution().singleNumber(nums));;
    }
}
