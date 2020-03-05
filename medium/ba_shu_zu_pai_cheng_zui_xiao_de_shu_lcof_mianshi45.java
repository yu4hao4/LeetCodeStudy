package medium;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-03-02-15:38
 */
public class ba_shu_zu_pai_cheng_zui_xiao_de_shu_lcof_mianshi45 {
    /**
     * question url:https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/
     * question context :
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     */
    class Solution {
        public String minNumber(int[] nums) {
            List<String> strList = new ArrayList<>();
            for (int num : nums) {
                strList.add(String.valueOf(num));
            }
            strList.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1));
            StringBuilder sb = new StringBuilder();
            for (String str : strList) {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        int[] nums = {33,30,34,5,9};
        ba_shu_zu_pai_cheng_zui_xiao_de_shu_lcof_mianshi45 ba_shu_zu_pai_cheng_zui_xiao_de_shu_lcof_mianshi45 = new ba_shu_zu_pai_cheng_zui_xiao_de_shu_lcof_mianshi45();
        System.out.println(ba_shu_zu_pai_cheng_zui_xiao_de_shu_lcof_mianshi45.new Solution().minNumber(nums));;

//        char[] chars = "122342130452".toCharArray();
//        Arrays.sort(chars);
//        System.out.println(Arrays.toString(chars));


//        for (char c : "12234213452".toCharArray()) {
//            System.out.println(c);
//        }

//        System.out.println(new BigDecimal("12").compareTo(new BigDecimal("123")));
    }
}
