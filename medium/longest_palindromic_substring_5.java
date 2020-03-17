package medium;

/**
 * @author 喻浩
 * @create 2020-03-17-8:56
 */
public class longest_palindromic_substring_5 {
    /**
     * question url:https://leetcode-cn.com/problems/longest-palindromic-substring/
     * question context :
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     */
    class Solution {
        public String longestPalindrome(String s) {
            int len = s.length();
            if (len < 2) {
                return s;
            }

            boolean[][] dp = new boolean[len][len];

            // 初始化
            for (int i = 0; i < len; i++) {
                dp[i][i] = true;
            }

            int maxLen = 1;
            int start = 0;

            for (int j = 1; j < len; j++) {
                for (int i = 0; i < j; i++) {

                    if (s.charAt(i) == s.charAt(j)) {
                        if (j - i < 3) {
                            dp[i][j] = true;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                    } else {
                        dp[i][j] = false;
                    }

                    // 只要 dp[i][j] == true 成立，就表示子串 s[i, j] 是回文，此时记录回文长度和起始位置
                    if (dp[i][j]) {
                        int curLen = j - i + 1;
                        if (curLen > maxLen) {
                            maxLen = curLen;
                            start = i;
                        }
                    }
                }
            }
            return s.substring(start, start + maxLen);
        }
    }

    public static void main(String[] args) {
        longest_palindromic_substring_5 longest_palindromic_substring_5 = new longest_palindromic_substring_5();
        System.out.println(longest_palindromic_substring_5.new Solution());;
    }
}
