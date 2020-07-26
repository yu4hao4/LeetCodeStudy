package easy;

/**
 * @author yuhao5
 * @date 2020-07-22
 */
public class xuan_zhuan_shu_zu_de_zui_xiao_shu_zi_lcof_mianshi_11 {
    /**
     * question url:https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
     * question context :
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
     *
     */
    class Solution {
        public int minArray(int[] numbers) {
            if (numbers == null){
                return -1;
            }

            int len = numbers.length;
            for (int i = 0; i < len-1; i++) {
                if (numbers[i+1] < numbers[i]){
                    return numbers[i+1];
                }
            }
            return numbers[0];
        }
    }

    public static void main(String[] args) {
        xuan_zhuan_shu_zu_de_zui_xiao_shu_zi_lcof_mianshi_11 xuan_zhuan_shu_zu_de_zui_xiao_shu_zi_lcof_mianshi_11 = new xuan_zhuan_shu_zu_de_zui_xiao_shu_zi_lcof_mianshi_11();
        System.out.println(xuan_zhuan_shu_zu_de_zui_xiao_shu_zi_lcof_mianshi_11.new Solution());;
    }
}
