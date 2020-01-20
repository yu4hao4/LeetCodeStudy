package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-01-20-17:37
 */
public class deep_dark_fraction_LCP2 {
    /**
     * question url:https://leetcode-cn.com/problems/deep-dark-fraction/
     * question context :
     * 有一个同学在学习分式。他需要将一个连分数化成最简分数，你能帮助他吗？
     *
     * 连分数是形如上图的分式。在本题中，所有系数都是大于等于0的整数。
     *
     * 输入的cont代表连分数的系数（cont[0]代表上图的a0，以此类推）。返回一个长度为2的数组[n, m]，使得连分数的值等于n / m，且n, m最大公约数为1
     */
    class Solution {
        public int[] fraction(int[] cont) {
            if (cont.length == 1 && cont[0] != 0){
                return new int[]{cont[cont.length-1],1};
            }
            int[] fraction = new int[]{1,cont[cont.length-1]};
            for (int i = cont.length-2; i >= 0; i--) {
                if(cont[i] != 0){
                    fractionAdd(fraction, cont[i]);
                    getResult(fraction);
                }
                if(i != 0){
                    reverseArray(fraction);
                }
            }
            return fraction;
        }
        
        public void fractionAdd(int[] fraction,int num){
            fraction[1] *= num;
            fraction[0] *= num;
            fraction[0] += num*fraction[1];
        }
        
        public void reverseArray(int[] fraction){
            int temp = fraction[0];
            fraction[0] = fraction[1];
            fraction[1] = temp;
        }
        
        public void getResult(int[] fraction){
            int  temp;//定义整型变量
            int a = fraction[0],b = fraction[1];
            temp= Math.min(a, b);//采种条件运算表达式求出两个数中的最小值
            while(temp>0) {
                if(a%temp==0&&b%temp==0)//只要找到一个数能同时被a,b所整除，则中止循环
                    break;
                temp--;//如不满足if条件则变量自减，直到能被a,b所整除 
            }
            
            if(temp > 1){
                fraction[0] /= temp;
                fraction[1] /= temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] fraction = new int[]{3,2,0,2};
//        int[] fraction = new int[]{0,0,3};
        deep_dark_fraction_LCP2 deep_dark_fraction_LCP2 = new deep_dark_fraction_LCP2();
        System.out.println(deep_dark_fraction_LCP2.new Solution().fraction(fraction));
    }
}
