package medium;

import java.util.Stack;

/**
 * @author yuhao5
 * @date 2020-06-11
 */
public class daily_temperatures_739 {
    /**
     * question url:https://leetcode-cn.com/problems/daily-temperatures/
     * question context :
     * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
     *
     * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
     *
     * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
     */
    class Solution {
        public int[] dailyTemperatures(int[] T) {
            if (T == null || T.length ==0 || T.length == 1){
                return new int[0];
            }

            int[] ans = new int[T.length];
            Stack <Integer> stack = new Stack<>();
            for (int i = 0; i < T.length; i++) {

                while (!stack.isEmpty() && T[i] > T[stack.peek()]){
                    Integer pop = stack.pop();
                    ans[pop] = i - pop;
                }

                stack.push(i);
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        daily_temperatures_739 daily_temperatures_739 = new daily_temperatures_739();
        System.out.println(daily_temperatures_739.new Solution());;
    }
}
