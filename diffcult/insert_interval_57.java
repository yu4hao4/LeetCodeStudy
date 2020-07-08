package diffcult;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuhao5
 * @date 2020-06-30
 */
public class insert_interval_57 {
    /**
     * question url:https://leetcode-cn.com/problems/insert-interval/
     * question context :给出一个无重叠的 ，按照区间起始端点排序的区间列表。
     *
     * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
     */
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            if (newInterval == null){
                return intervals;
            }

            List<int[]> ans = new ArrayList<>();
            int insertIndex = 0;
            for (int[] interval : intervals) {
                if (interval[1] < newInterval[0]){
                    ans.add(interval);
                    insertIndex++;
                }else if (interval[0] > newInterval[1]){
                    ans.add(interval);
                }else {
                    newInterval[0] = Math.min(newInterval[0], interval[0]);
                    newInterval[1] = Math.max(newInterval[1], interval[1]);
                }
            }

            ans.add(insertIndex, newInterval);

            return ans.toArray(new int[ans.size()][2]);
        }
    }

    public static void main(String[] args) {
        insert_interval_57 insert_interval_57 = new insert_interval_57();
        System.out.println(insert_interval_57.new Solution());;
    }
}
