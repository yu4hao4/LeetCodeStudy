package easy;

import java.util.ArrayList;

/**
 * @author 喻浩
 * @create 2019-09-06-10:27
 */
public class keyboard_row_500 {
    /**
     * question url:https://leetcode-cn.com/problems/keyboard-row/
     * question context :
     * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
     */
    class Solution {
        public String[] findWords(String[] words) {
            String pattern1 = "qwertyuiop";
            String pattern2 = "asdfghjkl";
            String pattern3 = "zxcvbnm";
            ArrayList<String> result = new ArrayList<String>();
            int i,length;
            String str,str1;
            for(String word : words){
                str1 = word.substring(0, 1).toLowerCase();
                i = 0;
                length = word.length();
                if(pattern1.contains(str1)){
                    str = judge(i, length, pattern1, word);
                    if(null != str){
                        result.add(str);
                    }
                }else if(pattern2.contains(str1)){
                    str = judge(i, length, pattern2, word);
                    if(null != str){
                        result.add(str);
                    }
                }else if(pattern3.contains(str1)){
                    str = judge(i, length, pattern3, word);
                    if(null != str){
                        result.add(str);
                    }
                }
            }
            String[] res = new String[result.size()];
            int j = 0;
            for(String s : result){
                res[j] = s;
                j++;
            }
            return res;
        }

        private String judge(int i,int length,String pattern,String word) {
            while(i <length){
                if(!pattern.contains(word.substring(i, i+1).toLowerCase())){
                    return null;
                }
                i++;
            }
            return word;
        }
    }
    
    public static void main(String[] args) {
        String[] a = {"Hello","Alaska","Dad","Peace"};
        keyboard_row_500 keyboard_row_500 = new keyboard_row_500();
//        System.out.println(keyboard_row_500.new Solution());;
        String[] words = keyboard_row_500.new Solution().findWords(a);
        for (String  w : words){
            System.out.println(w);
        }
    }
}
