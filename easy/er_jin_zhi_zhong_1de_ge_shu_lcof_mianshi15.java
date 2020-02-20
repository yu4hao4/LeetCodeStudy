package easy;

/**
 * @author 喻浩
 * @create 2020-02-15-11:33
 */
public class er_jin_zhi_zhong_1de_ge_shu_lcof_mianshi15 {
    /**
     * question url:https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
     * question context :
     * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
     */
    class Solution {
        public int hammingWeight(int n) {
            int num = 0;
            while (n != 0){
                n &= n-1;
                num++;
            }
            return num;
        }
    }
    
    public static void main(String[] args) {
        er_jin_zhi_zhong_1de_ge_shu_lcof_mianshi15 er_jin_zhi_zhong_1de_ge_shu_lcof_mianshi15 = new er_jin_zhi_zhong_1de_ge_shu_lcof_mianshi15();
        System.out.println(er_jin_zhi_zhong_1de_ge_shu_lcof_mianshi15.new Solution().hammingWeight(Integer.parseInt("4294967293")));
    }
}
