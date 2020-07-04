/**
 * @author 喻浩
 * @create 2020-06-30-22:57
 */
public class counting_bits_338 {
    /**
     * question url:https://leetcode-cn.com/problems/counting-bits/
     * question context :
     * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
     */
    class Solution {
        public int[] countBits(int num) {
            if (num == 0 ){
                return new int[]{0};
            }

            int[] ans = new int[num+1];
            ans[0] = 0;
            ans[1] = 1;
            ans[2] = 1;

            for (int i = 3; i < num; i++) {
                if (i % 2 == 0){
                    ans[i] = ans[i/2];
                } else {
                    ans[i] = ans[i] + 1;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        counting_bits_338 counting_bits_338 = new counting_bits_338();
        System.out.println(counting_bits_338.new Solution());;
    }
}
