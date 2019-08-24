package easy;

/**
 * @author 喻浩
 * @create 2019-08-24-15:35
 */
public class robot_return_to_origin_657 {
    /**
     * question url:https://leetcode-cn.com/problems/robot-return-to-origin/
     * question context :
     * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
     *
     * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
     *
     * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
     */
    class Solution {
        public boolean judgeCircle(String moves) {
            if(moves.length() %2 != 0){
                return false;
            }
            int vertical = 0;
            int level = 0;
            for(char ch : moves.toCharArray()){
                if(ch == 'R'){
                    level++;
                }else if(ch == 'L'){
                    level--;
                }else if(ch == 'U'){
                    vertical++;
                }else if(ch == 'D'){
                    vertical--;
                }
            }
            return vertical == 0 && level ==0 ? true : false;
        }
    }
    
    public static void main(String[] args) {
        robot_return_to_origin_657 robot_return_to_origin_657 = new robot_return_to_origin_657();
        System.out.println(robot_return_to_origin_657.new Solution());;
    }
}
