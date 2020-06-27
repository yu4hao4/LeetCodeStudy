import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author 喻浩
 * @create 2020-05-23-17:03
 */
public class merge_intervals_56 {
    /**
     * question url:https://leetcode-cn.com/problems/merge-intervals/
     * question context :
     * 给出一个区间的集合，请合并所有重叠的区间。
     */
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1){
                return intervals;
            }

            Arrays.sort( intervals, Comparator.comparingInt(value -> value[0]));
            LinkedList<int[]> ans = new LinkedList();
            for (int i = 0; i < intervals.length-1; i++) {
                if (intervals[i][1] > intervals[i+1][0]){
                    intervals[i+1][0] = intervals[i][0];
                    intervals[i+1][1] = Math.max(intervals[i][1], intervals[i+1][1]);
                } else {
                    ans.add(intervals[i]);
                }
            }
            ans.add(intervals[intervals.length-1]);
            return ans.toArray(new int[ans.size()][2]);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{8,10},{2,6},{15,18}};
        merge_intervals_56 merge_intervals_56 = new merge_intervals_56();
        System.out.println(Arrays.deepToString(merge_intervals_56.new Solution().merge(arr)));
    }
}
