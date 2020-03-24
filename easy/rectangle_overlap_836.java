package easy;

/**
 * @author 喻浩
 * @create 2020-03-18-10:25
 */
public class rectangle_overlap_836 {
    /**
     * question url:https://leetcode-cn.com/problems/rectangle-overlap/
     * question context :
     * 矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。
     *
     * 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。
     *
     * 给出两个矩形，判断它们是否重叠并返回结果。
     *
     */
    class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            return !( rec2[0]>=rec1[2] || rec2[1]>=rec1[3] || rec2[2]<=rec1[0] || rec2[3]<=rec1[1] );
        }
    }

    public static void main(String[] args) {
//        int[] rec1 = {7,8,13,15};
        int[] rec1 = {5,15,8,18};
//        int[] rec2 = {10,8,12,20};
        int[] rec2 = {0,3,7,9};
        rectangle_overlap_836 rectangle_overlap_836 = new rectangle_overlap_836();
        System.out.println(rectangle_overlap_836.new Solution().isRectangleOverlap(rec1, rec2));
    }
}
