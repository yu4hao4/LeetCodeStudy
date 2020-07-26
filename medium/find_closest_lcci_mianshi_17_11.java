package medium;

import mock.MockData;

/**
 * @author yuhao5
 * @date 2020-07-16
 */
public class find_closest_lcci_mianshi_17_11 {
    /**
     * question url:https://leetcode-cn.com/problems/find-closest-lcci/
     * question context :
     * 有个内含单词的超大文本文件，给定任意两个单词，找出在这个文件中这两个单词的最短距离(相隔单词数)。如果寻找过程在这个文件中会重复多次，而每次寻找的单词不同，你能对此优化吗?
     */
    class Solution {
        public int findClosest(String[] words, String word1, String word2) {
            if (words == null || words.length < 2){
                return 0;
            }
            int w1Index = -1;
            int w2Index = -1;
            int ans = Integer.MAX_VALUE;
            int len = words.length;
            for (int i = 0; i < len; i++) {
                if (words[i].equals(word1)){
                    w1Index = i;
                }

                if (words[i].equals(word2)){
                    w2Index = i;

                }

                if (w1Index > -1 && w2Index > -1){
                    ans = Math.min(Math.abs(w1Index-w2Index), ans);
                }

                if (ans <= 1){
                    return ans;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        find_closest_lcci_mianshi_17_11 find_closest_lcci_mianshi_17_11 = new find_closest_lcci_mianshi_17_11();
        System.out.println(find_closest_lcci_mianshi_17_11.new Solution().findClosest(MockData.strs, "o", "fk"));
    }
}
