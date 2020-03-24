package easy;

/**
 * @author 喻浩
 * @create 2020-03-18-11:27
 */
public class reverse_integer_7 {
    /**
     * question url:https://leetcode-cn.com/problems/reverse-integer/
     * question context :
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
     */
    class Solution {
        public int reverse(int x) {
            int temp = x;
            StringBuilder reverse = new StringBuilder(Math.abs(x)).reverse();
            if ((reverse.length() > String.valueOf(Integer.MAX_VALUE).length())
            ){
                return 0;
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        reverse_integer_7 reverse_integer_7 = new reverse_integer_7();
        System.out.println(reverse_integer_7.new Solution());;
    }
}
