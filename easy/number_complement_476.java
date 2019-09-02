package easy;

/**
 * @author 喻浩
 * @create 2019-09-02-16:42
 */
public class number_complement_476 {
    /**
     * question url:https://leetcode-cn.com/problems/number-complement/
     * question context :
     * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
     *
     * 注意:
     *
     * 给定的整数保证在32位带符号整数的范围内。
     * 你可以假定二进制数不包含前导零位
     */
    class Solution {
        public int findComplement(int num) {
            String binaryString = Integer.toBinaryString(5);
            char[] chars = binaryString.toCharArray();
            int result = 0;
            for(int i = 0;i < chars.length;i++){
                if(chars[i] == '0'){
                    result += Math.pow(2,(chars.length-i-1));
                }
            }
            
            return result;
        }
    }
    
    public static void main(String[] args) {
        number_complement_476 number_complement_476 = new number_complement_476();
        System.out.println(number_complement_476.new Solution().findComplement(5));
    }
}
