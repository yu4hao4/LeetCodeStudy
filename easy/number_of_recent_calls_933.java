package easy;

/**
 * @author 喻浩
 * @create 2019-09-03-10:04
 */
public class number_of_recent_calls_933 {
    /**
     * question url:https://leetcode-cn.com/problems/number-of-recent-calls/
     * question context :
     * 写一个 RecentCounter 类来计算最近的请求。
     *
     * 它只有一个方法：ping(int t)，其中 t 代表以毫秒为单位的某个时间。
     *
     * 返回从 3000 毫秒前到现在的 ping 数。
     *
     * 任何处于 [t - 3000, t] 时间范围之内的 ping 都将会被计算在内，包括当前（指 t 时刻）的 ping。
     *
     * 保证每次对 ping 的调用都使用比之前更大的 t 值。
     */
    class Solution {
    
    }
    
    public static void main(String[] args) {
        number_of_recent_calls_933 number_of_recent_calls_933 = new number_of_recent_calls_933();
        System.out.println(number_of_recent_calls_933.new Solution());;
    }
}
