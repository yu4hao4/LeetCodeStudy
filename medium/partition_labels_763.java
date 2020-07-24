package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yuhao5
 * @date 2020-07-16
 */
public class partition_labels_763 {
    /**
     * question url:https://leetcode-cn.com/problems/partition-labels/
     * question context :
     * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
     */
    class Solution {
        public List<Integer> partitionLabels(String S) {
            if (S == null || S.length() == 0){
                return new ArrayList<>();
            }
            int len = S.length();
            int[] letters = new int[26];

            for(int i = len - 1; i >= 0; i--){
                if(letters[S.charAt(i)-'a'] == 0){
                    letters[S.charAt(i)-'a'] = i;
                }
            }

            int begin = 0;
            int end = 0;
            List<Integer> ans = new ArrayList<>();
            while (begin < len){
                end = letters[S.charAt(begin)-'a'];
                int i = begin;
                for (; i < end; i++) {
                    int index = S.charAt(i)-'a';
                    end = Math.max(letters[index], end);
                }

                ans.add(end-begin+1);
                begin = i+1;
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        partition_labels_763 partition_labels_763 = new partition_labels_763();
        System.out.println(partition_labels_763.new Solution().partitionLabels("ababcbacadefegdehijhklij"));
    }
}
