package medium;

import java.util.Arrays;
import java.util.List;

/**
 * @author yuhao5
 * @date 2020-06-25
 */
public class word_break_139 {
    /**
     * question url:https://leetcode-cn.com/problems/word-break/
     * question context :
     * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
     *
     * 说明：
     *
     * 拆分时可以重复使用字典中的单词。
     * 你可以假设字典中没有重复的单词。
     */
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            if (s == null ){
                return false;
            }

            boolean[] ans = new boolean[s.length()+1];
            ans[0] = true;

            for (int i = 1; i <= s.length(); i++) {
                for (String word : wordDict) {
                    int len = word.length();
                    if (i >= len && ans[i-len] && word.equals(s.substring(i - len, i))) {
                        ans[i] = true;
                        break;
                    }
                }
            }
            return ans[ans.length-1];
        }
    }

    public static void main(String[] args) {
        word_break_139 word_break_139 = new word_break_139();
        System.out.println(word_break_139.new Solution().wordBreak("leetcode", Arrays.asList("leet","code")));
    }
}
