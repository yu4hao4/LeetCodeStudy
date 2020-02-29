package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-28-21:35
 */
public class fan_zhuan_dan_ci_shun_xu_lcof_mianshi58 {
    /**
     * question url:https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
     * question context :
     * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
     */
    class Solution {
        public String reverseWords(String s) {
            String[] split = s.trim().replaceAll("[ ]{2,}", " ").split("[ ]");
            System.out.println(split.length);
            StringBuilder result = new StringBuilder();
            for (int i = split.length - 1; i >= 0; i--) {
                if (i != 0){
                    result.append(split[i]).append(" ");
                }else {
                    result.append(split[i]);
                }
            }
            return String.valueOf(result);
        }
    }

    public static void main(String[] args) {
        fan_zhuan_dan_ci_shun_xu_lcof_mianshi58 fan_zhuan_dan_ci_shun_xu_lcof_mianshi58 = new fan_zhuan_dan_ci_shun_xu_lcof_mianshi58();
        System.out.println(fan_zhuan_dan_ci_shun_xu_lcof_mianshi58.new Solution().reverseWords("a good   example"));;
    }
}
