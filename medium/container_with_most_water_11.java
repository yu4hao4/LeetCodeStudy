package medium;

/**
 * @author yuhao5
 * @date 2020-06-30
 */
public class container_with_most_water_11 {
    /**
     * question url:https://leetcode-cn.com/problems/container-with-most-water/
     * question context :
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     *
     * 说明：你不能倾斜容器，且 n 的值至少为 2。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/container-with-most-water
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    class Solution {
        public int maxArea(int[] height) {
            if (height == null || height.length < 2){
                return 0;
            }

            if (height.length == 2){
                return Math.min(height[0],height[1]);
            }

            int begin = 0;
            int end = height.length-1;
            int maxAns = Integer.MIN_VALUE;
            while (begin < end){
                int num = (end - begin)* Math.min(height[begin],height[end]);
                maxAns = Math.max(maxAns, num);
                if (height[begin] < height[end]){
                    begin++;
                }else {
                    end--;
                }
            }
            return maxAns;
        }
    }

    public static void main(String[] args) {
        container_with_most_water_11 container_with_most_water_11 = new container_with_most_water_11();
        System.out.println(container_with_most_water_11.new Solution());;
    }
}
