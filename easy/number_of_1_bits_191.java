package easy;

/**
 * @author 喻浩
 * @create 2020-01-19-18:06
 */
public class number_of_1_bits_191 {
    /**
     * question url:https://leetcode-cn.com/problems/number-of-1-bits/
     * question context :
     * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
     */
    class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int bits = 0;
            int mask = 1;
            for (int i = 0; i < 32; i++) {
                if ((n & mask) != 0) {
                    bits++;
                }
                n >>= 1;
            }
            return bits;
        }
        
    }
    
    public static void main(String[] args) {
        number_of_1_bits_191 number_of_1_bits_191 = new number_of_1_bits_191();
        System.out.println(number_of_1_bits_191.new Solution().hammingWeight(0b11111111111111111111111111111101));
//        System.out.println(7/2.0);
    }
}
