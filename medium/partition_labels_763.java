import java.util.ArrayList;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-07-17-22:28
 */
public class partition_labels_763 {
    /**
     * question url:https://leetcode-cn.com/problems/partition-labels/
     * question context :
     * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。
     * 返回一个表示每个字符串片段的长度的列表。
     */
    class Solution {
        public List<Integer> partitionLabels(String S) {
            int[] temp = new int[27];
            List<Integer> ans = new ArrayList<>();

            int len = S.length();
            for (int i = len-1; i > 0; i--) {
                int index = S.charAt(i)-'a' + 1;
                if (temp[index] == 0){
                    temp[index] = index;
                }
            }

            for (int i = 0; i < len; i++) {
                int index = S.charAt(i)-'a' + 1;
                int right = temp[index];
                for (int j = i+1; j < right; j++) {
                    int index1 =  S.charAt(i)-'a' + 1;
                    int right1 = temp[index1];
                    right = Math.max(right1, right);
                }
                ans.add(right-index);
                i = right;
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        partition_labels_763 partition_labels_763 = new partition_labels_763();
        System.out.println(partition_labels_763.new Solution().partitionLabels("ababcbacadefegdehijhklij"));
    }
}
