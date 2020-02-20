package easy;

/**
 * @author 喻浩
 * @create 2020-02-13-14:14
 */
public class zuo_xuan_zhuan_zi_fu_chuan_lcof_mianshi58 {
    /**
     * question url:https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
     * question context :
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     */
    class Solution {
        public String reverseLeftWords(String s, int n) {
            char[] chars = s.toCharArray();
            char[] res = new char[chars.length];
            int index = 0;
            for (int i = n; i < chars.length; i++) {
                res[index++] = chars[i];
            }
            
            for (int i = 0; i < n; i++) {
                res[index++] = chars[i];
            }
            return String.valueOf(res);
        }
    }
    
    public static void main(String[] args) {
        zuo_xuan_zhuan_zi_fu_chuan_lcof_mianshi58 zuo_xuan_zhuan_zi_fu_chuan_lcof_mianshi58 = new zuo_xuan_zhuan_zi_fu_chuan_lcof_mianshi58();
        System.out.println(zuo_xuan_zhuan_zi_fu_chuan_lcof_mianshi58.new Solution());;
    }
}
