package easy;

/**
 * @author 喻浩
 * @create 2019-09-20-11:02
 */
public class sqrtx_69 {
    /**
     * question url:https://leetcode-cn.com/problems/sqrtx/
     * question context :
     * 实现 int sqrt(int x) 函数。
     *
     * 计算并返回 x 的平方根，其中 x 是非负整数。
     *
     * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去
     * 
     * 踩坑：
     * 当 int 型数据值为 2147483647 时，会 int 溢出，所以
     * (i+1L)*(i+1L) 将值转变为 long 型，则可以得出正确答案
     */
    class Solution {
        public int mySqrt(int x){
            if(x == 1){
                return 1;
            }
            for(int i = 0;i <= x/2;i++){
                if(i * i == x){
                    return i;
                }
                if(i*i < x && (i+1L)*(i+1L) > x){
                    return i;
                }
            }
            return 0;
        }
    }
    
    public static void main(String[] args) {
        sqrtx_69 sqrtx_69 = new sqrtx_69();
        System.out.println(sqrtx_69.new Solution().mySqrt(2147483647));;
//        System.out.println((int) Math.sqrt(4));
    }
}
