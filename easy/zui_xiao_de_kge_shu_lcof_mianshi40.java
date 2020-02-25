package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-02-22-18:56
 */
public class zui_xiao_de_kge_shu_lcof_mianshi40 {
    /**
     * question url:https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
     * question context :
     * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
     */
    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            Arrays.sort(arr);
            return Arrays.copyOfRange(arr, 0,k);
        }
    }
    
    public static void main(String[] args) {
        zui_xiao_de_kge_shu_lcof_mianshi40 zui_xiao_de_kge_shu_lcof_mianshi40 = new zui_xiao_de_kge_shu_lcof_mianshi40();
        System.out.println(zui_xiao_de_kge_shu_lcof_mianshi40.new Solution());;
    }
}
