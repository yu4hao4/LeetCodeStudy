import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-04-10-17:52
 */
public class plus_one_66 {
    /**
     * question url:https://leetcode-cn.com/problems/plus-one/
     * question context :
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     *
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     *
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     */
    class Solution {
        public int[] plusOne(int[] digits) {
            if (digits == null || digits.length == 0){
                return null;
            }

            digits[digits.length-1] += 1;

            for (int i = digits.length - 1; i >= 0; i--) {
                if (i == 0 && digits[i] > 9){
                    int[] ans = new int[digits.length+1];
                    System.arraycopy(digits,0, ans, 1, digits.length);
                    ans[0] = digits[i] / 10;
                    ans[1] = digits[i] % 10;
                    digits = ans;
                }

                if (digits[i] > 9){
                    digits[i-1] += digits[i] / 10;
                    digits[i] = digits[i] % 10;
                }
            }

            return digits;
        }
    }

    public static void main(String[] args) {
//        int[] nums = {9};
//        int[] nums = {1,2,3};
        int[] nums = {1,2,9};
        plus_one_66 plus_one_66 = new plus_one_66();
        System.out.println(
                Arrays.toString(plus_one_66.new Solution().plusOne(nums))
        );
    }
}
