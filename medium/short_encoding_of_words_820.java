package medium;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-03-28-15:05
 */
public class short_encoding_of_words_820 {
    /**
     * question url:https://leetcode-cn.com/problems/short-encoding-of-words/
     * question context :
     * 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
     *
     * 例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0, 2, 5]。
     *
     * 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
     *
     * 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
     *
     */
    class Solution {
        public int minimumLengthEncoding(String[] words) {
            int ans = 0;
            if (words == null || words.length == 0){
                return ans;
            }

            for (int i = 0; i < words.length; i++) {
                words[i] = String.valueOf(new StringBuilder(words[i]).reverse());
            }
            Arrays.sort(words);

            System.out.println(Arrays.toString(words));

            for (int i = 0; i < words.length; i++) {
                if (!(i + 1 < words.length && words[i+1].startsWith(words[i]))){
                    ans += words[i].length()+1;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        String[] words = {"time", "me", "bell"};
        short_encoding_of_words_820 short_encoding_of_words_820 = new short_encoding_of_words_820();
        System.out.println(short_encoding_of_words_820.new Solution().minimumLengthEncoding(words));;

        System.out.println("em".startsWith("emit"));
    }
}
