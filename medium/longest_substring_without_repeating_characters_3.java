package medium;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 喻浩
 * @create 2020-03-16-11:42
 */
public class longest_substring_without_repeating_characters_3 {
    /**
     * question url:https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * question context :
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     */
    class Solution {
        public int lengthOfLongestSubstring1(String s) {
            if (s == null || s.length() == 0){
                return 0;
            }

            char[] chars = s.toCharArray();
            int ans = 0;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(chars[0]));
            int maxLen = 1;
            for (int i = 1; i < chars.length; i++) {
                ans = Math.max(maxLen, ans);
                if (stringBuilder.indexOf(String.valueOf(chars[i])) == -1){
                    stringBuilder.append(chars[i]);
                    maxLen++;
                    continue;
                }

                if (stringBuilder.indexOf(String.valueOf(chars[i])) != -1){
                    maxLen = 1;
                    stringBuilder = new StringBuilder(String.valueOf(chars[i]));
                }
            }

            return ans;
        }

        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                // try to extend the range [i, j]
                if (!set.contains(s.charAt(j))){
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                }
                else {
                    set.remove(s.charAt(i++));
                }
            }
            return ans;

        }
    }

    public static void main(String[] args) {
        longest_substring_without_repeating_characters_3 longest_substring_without_repeating_characters_3 = new longest_substring_without_repeating_characters_3();
        System.out.println(longest_substring_without_repeating_characters_3.new Solution().lengthOfLongestSubstring("pwwkew"));
        System.out.println(longest_substring_without_repeating_characters_3.new Solution().lengthOfLongestSubstring("bbbbb"));
        System.out.println(longest_substring_without_repeating_characters_3.new Solution().lengthOfLongestSubstring("abcabcbb"));
    }
}
