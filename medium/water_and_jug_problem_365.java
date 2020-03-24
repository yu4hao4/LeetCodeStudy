package medium;

/**
 * @author 喻浩
 * @create 2020-03-21-21:08
 */
public class water_and_jug_problem_365 {
    /**
     * question url:https://leetcode-cn.com/problems/water-and-jug-problem/
     * question context :
     * 有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？
     *
     * 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。
     *
     * 你允许：
     *
     * 装满任意一个水壶
     * 清空任意一个水壶
     * 从一个水壶向另外一个水壶倒水，直到装满或者倒空
     */
    class Solution {
        public boolean canMeasureWater(int x, int y, int z) {
            if(x==z||y==z||x+y<=z){
                if(x+y<z){
                    return false;
                }
                return true;
            }
            return x>y?(z%gcd(x,y))==0:(z%gcd(y,x))==0;
        }
        public int gcd(int x,int y){
            return y==0?x:gcd(y,x%y);
        }
    }


    public static void main(String[] args) {
        water_and_jug_problem_365 water_and_jug_problem_365 = new water_and_jug_problem_365();
        System.out.println(water_and_jug_problem_365.new Solution());;
    }
}
