package easy;

/**
 * @author 喻浩
 * @create 2020-02-29-20:08
 */
public class que_shi_de_shu_zi_lcof_mianshi53 {
    /**
     * question url:https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
     * question context :
     * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
     */
    class Solution {
        public int missingNumber(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i){
                    return i;
                }
            }
            return nums.length;
        }
    }

    public static void main(String[] args) {
        que_shi_de_shu_zi_lcof_mianshi53 que_shi_de_shu_zi_lcof_mianshi53 = new que_shi_de_shu_zi_lcof_mianshi53();
        System.out.println(que_shi_de_shu_zi_lcof_mianshi53.new Solution());;
    }
}
