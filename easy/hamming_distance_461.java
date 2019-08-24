package easy;

/**
 * @author 喻浩
 * @create 2019-08-24-15:23
 */
public class hamming_distance_461 {
    /**
     * question url:https://leetcode-cn.com/problems/hamming-distance/
     * question context :
     * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
     *
     * 给出两个整数 x 和 y，计算它们之间的汉明距离。
     */
    class Solution {
        int result = 0;
        public int hammingDistance(int x, int y) {
            if(x == 0 && y == 0){
                return result;
            }
            if(x%2 != y%2){
                result++;
            }
            x = x/2;
            y = y/2;
            return hammingDistance(x, y);
        }
    }
    
    public static void main(String[] args) {
        hamming_distance_461 hamming_distance_461   = new hamming_distance_461();
        System.out.println(hamming_distance_461.new Solution().hammingDistance(1, 4));;
    }
}
