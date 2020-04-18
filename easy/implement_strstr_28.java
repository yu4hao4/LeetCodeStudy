/**
 * @author 喻浩
 * @create 2020-04-18-21:11
 */
public class implement_strstr_28 {
    /**
     * question url:https://leetcode-cn.com/problems/implement-strstr/
     * question context :
     * 实现 strStr() 函数。
     *
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     */
    class Solution {
        public int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
        }
    }

    public static void main(String[] args) {
        implement_strstr_28 implement_strstr_28 = new implement_strstr_28();
        System.out.println(implement_strstr_28.new Solution());;
    }
}
