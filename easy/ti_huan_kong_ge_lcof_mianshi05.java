package easy;

/**
 * @author 喻浩
 * @create 2020-02-13-19:28
 */
public class ti_huan_kong_ge_lcof_mianshi05 {
    /**
     * question url:https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
     * question context :
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     */
    class Solution {
        public String replaceSpace(String s) {
            char[] chars = s.toCharArray();
            char[] temp = new char[s.length()*3];
            int offset = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ' '){
                    temp[i+offset] = '%';
                    temp[i+offset+1] = '2';
                    temp[i+offset+2] = '0';
                    offset += 2;
                }else {
                    temp[i+offset] = chars[i];
                }
            }

            char[] res = new char[chars.length+offset];
            for (int i = 0; i < chars.length+offset; i++) {
                res[i] = temp[i];
            }
            
            return String.valueOf(res);
        }
    }
    
    public static void main(String[] args) {
        ti_huan_kong_ge_lcof_mianshi05 ti_huan_kong_ge_lcof_mianshi05 = new ti_huan_kong_ge_lcof_mianshi05();
        System.out.println(ti_huan_kong_ge_lcof_mianshi05.new Solution().replaceSpace("We are happy."));
    }
}
