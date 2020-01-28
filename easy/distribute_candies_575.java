package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-01-28-21:31
 */
public class distribute_candies_575 {
    /**
     * question url:https://leetcode-cn.com/problems/distribute-candies/
     * question context :
     * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
     */
    class Solution {
        public int distributeCandies(int[] candies) {
            Arrays.sort(candies);
            
            int num = 1;
            for (int i = 1; i < candies.length; i++) {
                if (candies[i] != candies[i-1]){
                    num++;
                }
            }
            
            return Math.min(num, candies.length / 2);
        }
    }
    
    public static void main(String[] args) {
        distribute_candies_575 distribute_candies_575 = new distribute_candies_575();
        System.out.println(distribute_candies_575.new Solution());
    }
}
