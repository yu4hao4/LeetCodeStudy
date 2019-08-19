package easy;

/**
 * @author 喻浩
 * @create 2019-08-19-16:13
 * url:https://leetcode-cn.com/problems/defanging-an-ip-address/
 */
public class defanging_an_ip_address_1108 {
    class Solution {
        public String defangIPaddr(String address) {
            String result = "";
            result = address.replaceAll("\\.", "[.]");
            return result;
        }
    }
    public static void main(String[] args) {
        defanging_an_ip_address_1108 d = new defanging_an_ip_address_1108();
        System.out.println(d.new Solution().defangIPaddr("1.1.1.1"));;
    }
}
