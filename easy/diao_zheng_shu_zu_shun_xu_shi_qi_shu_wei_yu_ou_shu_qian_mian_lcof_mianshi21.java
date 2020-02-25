package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-21-16:02
 */
public class diao_zheng_shu_zu_shun_xu_shi_qi_shu_wei_yu_ou_shu_qian_mian_lcof_mianshi21 {
    /**
     * question url:https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
     * question context :
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
     */
    class Solution {
        public int[] exchange(int[] nums) {
            int begin = 0;
            int end = nums.length-1;
            int temp;
            while (begin < end){
                if ( (nums[begin] & 1) != 0 ){
                    //奇数
                    begin++;
                    continue;
                }
                
                if ((nums[end] & 1) == 0){
                    //偶数
                    end--;
                    continue;
                }
                
                
                if ( (nums[begin] & 1) == 0 && (nums[end] & 1) != 0){
                    temp = nums[begin];
                    nums[begin] = nums[end];
                    nums[end] = temp;
                    begin++;
                    end--;
                }
            }
            
            return nums;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        diao_zheng_shu_zu_shun_xu_shi_qi_shu_wei_yu_ou_shu_qian_mian_lcof_mianshi21 diao_zheng_shu_zu_shun_xu_shi_qi_shu_wei_yu_ou_shu_qian_mian_lcof_mianshi21 = new diao_zheng_shu_zu_shun_xu_shi_qi_shu_wei_yu_ou_shu_qian_mian_lcof_mianshi21();
        System.out.println(
                Arrays.toString(diao_zheng_shu_zu_shun_xu_shi_qi_shu_wei_yu_ou_shu_qian_mian_lcof_mianshi21.new Solution().exchange(nums))
        );;
    }
}
