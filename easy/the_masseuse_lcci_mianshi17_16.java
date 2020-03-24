package easy;

/**
 * @author 喻浩
 * @create 2020-03-24-16:10
 */
public class the_masseuse_lcci_mianshi17_16 {
    /**
     * question url:https://leetcode-cn.com/problems/the-masseuse-lcci/
     * question context :
     * 一个有名的按摩师会收到源源不断的预约请求，每个预约都可以选择接或不接。在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。给定一个预约请求序列，替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。
     */
    class Solution {
        public int massage(int[] nums) {
            if (nums.length == 0){
                return 0;
            }

            if (nums.length == 1){
                return nums[0];
            }

            int[] ans = new int[nums.length];
            ans[0] = nums[0];
            ans[1] = Math.max(nums[0],nums[1]);
            for (int i = 2; i < nums.length; i++) {
                ans[i] = Math.max(ans[i-1],ans[i-2]+nums[i]);
            }

            return ans[nums.length-1];
        }
    }

    public static void main(String[] args) {
        the_masseuse_lcci_mianshi17_16 the_masseuse_lcci_mianshi17_16 = new the_masseuse_lcci_mianshi17_16();
        System.out.println(the_masseuse_lcci_mianshi17_16.new Solution());;
    }
}
