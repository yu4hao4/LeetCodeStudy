package easy;

/**
 * @author 喻浩
 * @create 2019-09-04-8:52
 */
public class reverse_string_344 {
    /**
     * question url:https://leetcode-cn.com/problems/reverse-string/
     * question context :
     * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
     *
     * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
     *
     * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
     */
    class Solution {
        public void reverseString(char[] s) {
            int i = 0,j = s.length-1;
            char temp;
            while(i < j){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        reverse_string_344 reverse_string_344 = new reverse_string_344();
        System.out.println(reverse_string_344.new Solution());;
    }
}
