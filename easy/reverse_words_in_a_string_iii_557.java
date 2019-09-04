package easy;

/**
 * @author 喻浩
 * @create 2019-09-04-9:24
 */
public class reverse_words_in_a_string_iii_557 {
    /**
     * question url:https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
     * question context :
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     */
    class Solution {
        public String reverseWords(String s) {
            char[] chars = s.toCharArray();
            int x = 0,y;
            char temp;
            for(int i = 0;i < s.length();i++){
                if(chars[i] == ' ' || i == s.length()-1){
                    y = i-1;
                    if(i == s.length()-1){
                        y = i;
                    }
                    while(x < y){
                        temp = chars[x];
                        chars[x] = chars[y];
                        chars[y] = temp;
                        x++;
                        y--;
                    }
                    x = i+1;
                    continue;
                }
            }
            return String.valueOf(chars);
        }
    }
    
    public static void main(String[] args) {
        reverse_words_in_a_string_iii_557 reverse_words_in_a_string_iii_557 = new reverse_words_in_a_string_iii_557();
        System.out.println(reverse_words_in_a_string_iii_557.new Solution().reverseWords("Let's take LeetCode contest"));;
    }
}
