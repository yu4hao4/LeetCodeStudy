package easy;

import java.util.HashMap;

/**
 * @author 喻浩
 * @create 2020-03-17-8:01
 */
public class find_words_that_can_be_formed_by_characters_1160 {
    /**
     * question url:https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
     * question context :
     * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
     *
     * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
     *
     * 注意：每次拼写时，chars 中的每个字母都只能用一次。
     *
     * 返回词汇表 words 中你掌握的所有单词的 长度之和。
     */
    class Solution {
        public int countCharacters(String[] words, String chars) {
            if (chars.equals("") || words == null || words.length ==0){
                return 0;
            }
            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < chars.length(); i++) {
                if (map.get(chars.charAt(i)) == null){
                    map.put(chars.charAt(i), 1);
                } else {
                    map.put(chars.charAt(i), map.get(chars.charAt(i))+1);
                }
            }

            int ans = 0;
            HashMap<Character, Integer> temp = new HashMap(map);
            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    if (map.containsKey(word.charAt(i))){
                        map.put(word.charAt(i),map.get(word.charAt(i))-1);
                    }
                    if (map.get(word.charAt(i)) == null || map.get(word.charAt(i)) < 0){
                        break;
                    }
                    if (i == word.length()-1){
                        ans += word.length();
                    }
                }
                map = new HashMap(temp);
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        find_words_that_can_be_formed_by_characters_1160 find_words_that_can_be_formed_by_characters_1160 = new find_words_that_can_be_formed_by_characters_1160();
        System.out.println(find_words_that_can_be_formed_by_characters_1160.new Solution().countCharacters(words, chars));
    }
}
