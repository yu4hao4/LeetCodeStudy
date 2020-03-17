package easy;

/**
 * @author 喻浩
 * @create 2020-03-16-11:01
 */
public class compress_string_lcci_mianshi_01_06 {
    /**
     * question url:https://leetcode-cn.com/problems/compress-string-lcci/
     * question context :
     * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
     */
    class Solution {
        public String compressString(String S) {
            if (S.length() == 0){
                return "";
            }
            char[] chars = S.toCharArray();
            int beginLen = chars.length;

            StringBuilder stringBuilder = new StringBuilder();

            int len = 1;
            char c = chars[0];
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == c){
                    len++;
                    continue;
                }
                stringBuilder.append(c).append(len);
                c = chars[i];
                len = 1;
            }
            stringBuilder.append(c).append(len);
//            System.out.println(stringBuilder);
            return stringBuilder.length() >= beginLen ? S : String.valueOf(stringBuilder);
        }
    }

    public static void main(String[] args) {
        compress_string_lcci_mianshi_01_06 compress_string_lcci_mianshi_01_06 = new compress_string_lcci_mianshi_01_06();
//        System.out.println(compress_string_lcci_mianshi_01_06.new Solution().compressString("abbccd"));
        System.out.println(compress_string_lcci_mianshi_01_06.new Solution().compressString("bb"));
//        System.out.println(compress_string_lcci_mianshi_01_06.new Solution().compressString("aabcccccaaa"));
    }
}
