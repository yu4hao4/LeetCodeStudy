package medium;

/**
 * @author 喻浩
 * @create 2020-02-25-18:45
 */
public class qiu_12n_lcof_mianshi64 {
    /**
     * question url:https://leetcode-cn.com/problems/qiu-12n-lcof/
     * question context :
     * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     */
    class Solution {
        public int sumNums(int n) {
            return n*(1+n)/2;
        }
    }
    
    public static void main(String[] args) {
        qiu_12n_lcof_mianshi64 qiu_12n_lcof_mianshi64 = new qiu_12n_lcof_mianshi64();
        System.out.println(qiu_12n_lcof_mianshi64.new Solution().sumNums(3));;
    }
}
