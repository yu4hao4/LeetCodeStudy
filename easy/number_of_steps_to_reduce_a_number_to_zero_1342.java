package easy;

/**
 * @author 喻浩
 * @create 2020-02-13-13:49
 */
public class number_of_steps_to_reduce_a_number_to_zero_1342 {
    /**
     * question url:https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
     * question context :
     * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
     *
     */
    class Solution {
        public int numberOfSteps (int num) {
            int res = 0;
            while (num != 0){
                if (num>>1 >= (num+1)>>1){
                    num = num>>1;
                }else {
                    num--;
                }
                res++;
            }
            return res;
        }
    }
    
    public static void main(String[] args) {
        number_of_steps_to_reduce_a_number_to_zero_1342 number_of_steps_to_reduce_a_number_to_zero_1342 = new number_of_steps_to_reduce_a_number_to_zero_1342();
        System.out.println(number_of_steps_to_reduce_a_number_to_zero_1342.new Solution().numberOfSteps(14));
    }
}
