package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 喻浩
 * @create 2019-08-27-15:06
 */
public class self_dividing_numbers_728 {
    /**
     * question url:https://leetcode-cn.com/problems/self-dividing-numbers/
     * question context :
     * 自除数 是指可以被它包含的每一位数除尽的数。
     *
     * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
     *
     * 还有，自除数不允许包含 0 。
     *
     * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
     */
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            ArrayList<Integer> list = new ArrayList<Integer>(right/2);
            for(;left<=right;left++){
                if(left < 10){
                    list.add(left);
                }
                
                if(left > 10 && judge(left,left)){
                    list.add(left);
                }
            }
            return list;
        }
        
        public boolean judge(int num,int bit){
            int temp = bit/10;
            bit = bit%10;
            if(bit == 0 || num % bit != 0){
                return false;
            }else{
                if(temp == 0){
                    return true;
                }
                return judge(num,temp);
            }
        }
    }
    
    public static void main(String[] args) {
        self_dividing_numbers_728 self_dividing_numbers_728 = new self_dividing_numbers_728();
//        System.out.println(self_dividing_numbers_728.new Solution().selfDividingNumbers(1, 5));
        for(Integer number :self_dividing_numbers_728.new Solution().selfDividingNumbers(20, 22)){
            System.out.println(number);
        }
    }
}
