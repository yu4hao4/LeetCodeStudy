package easy;

/**
 * @author 喻浩
 * @create 2020-02-13-14:43
 */
public class d_yin_cong_1dao_zui_da_de_nwei_shu_lcof_mianshi17 {
    /**
     * question url:https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
     * question context :
     * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
     */
    class Solution {
        public int[] printNumbers(int n) {
            int nums = 0;
            for (int i = 0; i < n; i++) {
                nums = nums*10+9;
            }
            
            int[] res = new int[nums];
            for (int i = 0; i < res.length; i++) {
                res[i] = i+1;
            }
            return res;
        }
    }
    
    public static void main(String[] args) {
        d_yin_cong_1dao_zui_da_de_nwei_shu_lcof_mianshi17 d_yin_cong_1dao_zui_da_de_nwei_shu_lcof_mianshi17 = new d_yin_cong_1dao_zui_da_de_nwei_shu_lcof_mianshi17();
        System.out.println(d_yin_cong_1dao_zui_da_de_nwei_shu_lcof_mianshi17.new Solution());;

    }
}
