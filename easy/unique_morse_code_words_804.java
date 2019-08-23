package easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author 喻浩
 * @create 2019-08-22-17:24
 */
public class unique_morse_code_words_804 {
    /**
     * question url:https://leetcode-cn.com/problems/unique-morse-code-words/
     * question context :
     * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
     *
     * 为了方便，所有26个英文字母对应摩尔斯密码表如下：
     *
     * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
     * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
     *
     * 返回我们可以获得所有词不同单词翻译的数量。
     * 
     * 思路的话：
     * 首先把密码数组存起来，然后遍历每个传过来的单词，同时将每个单词转换为char数组，
     * 将char数组当中每个char强转为int型后和小写a的unicode比较，判断当前char与a的距离
     * 然后获得密码数组对应的密码片段，最终丢进treeset集合，去重，返回有效元素个数
     */
    class Solution {
//        class MyStringBuilder implements Comparator<StringBuilder>{
//
//            @Override
//            public int compare(StringBuilder o1, StringBuilder o2) {
//                return o1.toString().compareTo(o2.toString());
//            }
//        }
//        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//        public int uniqueMorseRepresentations(String[] words) {
//            TreeSet<StringBuilder> map = new TreeSet<>(new MyStringBuilder());
//            for(String word : words){
//                StringBuilder result = new StringBuilder();
//                char[] chars = word.toCharArray();
//                for(char ch : chars){
//                    result.append(code[(int)ch-97]);
//                }
//                map.add(result);
//            }
//            return map.size();
//        }

        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        public int uniqueMorseRepresentations(String[] words) {
            HashSet<String> map = new HashSet<>();
            for(String word : words){
                StringBuilder result = new StringBuilder();
                char[] chars = word.toCharArray();
                for(char ch : chars){
                    result.append(code[(int)ch-97]);
                }
                map.add(result.toString());
            }
            return map.size();
        }
    }
    
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        unique_morse_code_words_804 unique_morse_code_words_804 = new unique_morse_code_words_804();
        System.out.println(unique_morse_code_words_804.new Solution().uniqueMorseRepresentations(words));
        
    }
}
