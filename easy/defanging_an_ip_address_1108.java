package easy;

/**
 * @author 喻浩
 * @create 2019-08-19-16:13
 */
public class defanging_an_ip_address_1108 {
    /**
     * question url:https://leetcode-cn.com/problems/defanging-an-ip-address/
     * question context:
     * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
     *
     * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
     */
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
