package easy;

/**
 * @author 喻浩
 * @create 2019-11-05-19:12
 */
public class guess_numbers_LCP_1 {
    /**
     * question url:https://leetcode-cn.com/problems/guess-numbers/
     * question context :
     * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
     *
     * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
     */
    class Solution {
        public int game(int[] guess, int[] answer) {
            int result = 0;
            if(guess[0] == answer[0]){
                result++;
            }
            if(guess[1] == answer[1]){
                result++;
            }
            if(guess[2] == answer[2]){
                result++;
            }
            return result;   
        }
    }
    
    public static void main(String[] args) {
        guess_numbers_LCP_1 guess_numbers_LCP_1 = new guess_numbers_LCP_1();
        System.out.println(guess_numbers_LCP_1.new Solution());;
    }
}
