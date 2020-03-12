package easy;

import java.util.ArrayList;

/**
 * @author 喻浩
 * @create 2020-03-12-14:04
 */
public class greatest_common_divisor_of_strings_1071 {
    /**
     * question url:https://leetcode-cn.com/problems/greatest-common-divisor-of-strings/
     * question context :
     * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
     *
     * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
     */
    class Solution {
        public String gcdOfStrings(String str1, String str2) {

            if ( !(str1+str2).equals(str2+str1) ){
                return "";
            }

            int gcd = gcd(str1.length(), str2.length());

            String substring = str2.substring(0, gcd);

            char[] chars = str1.toCharArray();
            char[] chars1 = substring.toCharArray();
            for (int i = 0; i < chars.length; i += chars1.length) {
                for (int j = 0; j < chars1.length; j++) {
                    if (chars[j+i] != chars1[j]){
                        return "";
                    }
                }
            }

            return substring;
        }

        /**
         * 求两数的最大公约数
         * @param a
         * @param b
         * @return
         */
        private int gcd(int a, int b) {
            if (a % b == 0) return b;
            else   return gcd(b, a%b);
        }

    }

    public static void main(String[] args) {
        greatest_common_divisor_of_strings_1071 greatest_common_divisor_of_strings_1071 = new greatest_common_divisor_of_strings_1071();
        System.out.println(greatest_common_divisor_of_strings_1071.new Solution());;
    }
}
