package easy;

/**
 * @author 喻浩
 * @create 2019-08-28-15:42
 */
public class nim_game_292 {
    /**
     * question url:https://leetcode-cn.com/problems/nim-game/
     * question context :
     * 你和你的朋友，两个人一起玩 Nim 游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。
     *
     * 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。
     */
    class Solution {
        public boolean canWinNim(int n) {
            return n/4 != 0;
        }
    }
    
    public static void main(String[] args) {
        nim_game_292 nim_game_292 = new nim_game_292();
        System.out.println(nim_game_292.new Solution());;
    }
}
