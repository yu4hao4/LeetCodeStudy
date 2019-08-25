package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2019-08-24-16:05
 */
public class height_checker_1051 {
    /**
     * question url:https://leetcode-cn.com/problems/height-checker/
     * question context :
     * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
     *
     * 请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
     * 
     * 思路：
     *  最简单的方法就是将当前数组按小到大排序，然后比较不同的位置数量，也就是我用的方法。
     */
    class Solution {
        public int heightChecker(int[] heights) {
            int result = 0;
            int[] temp = new int[heights.length];
            for(int i = 0;i < heights.length;i++){
                temp[i] = heights[i];
            }
            Arrays.sort(temp);
            for(int i = 0;i < temp.length;i++){
                if(temp[i] != heights[i]){
                    result++;
                }
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
        int[] test ={1,1,4,2,1,3};
        height_checker_1051 height_checker_1051 = new height_checker_1051();
        System.out.println(height_checker_1051.new Solution().heightChecker(test));;
    }
}
