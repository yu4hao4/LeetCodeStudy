package medium;

import java.util.*;

/**
 * @author 喻浩
 * @create 2020-05-28-16:30
 */
public class letter_combinations_of_a_phone_number_17 {
    /**
     * question url:https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
     * question context :
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
     *
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     */
    class Solution {
        public List<String> letterCombinations(String digits) {
            if (digits == null || digits.length() == 0){
                return new ArrayList<>();
            }

            String[][] strs = {{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},
                    {"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
            if (digits.length() == 1){
                return new ArrayList<>(Arrays.asList(strs[Integer.parseInt(digits)-2]));
            }

            String[] split = digits.split("");
            System.out.println(Arrays.toString(split));
            LinkedList<String> ans = null;
            if (split.length == 2){
                ans = new LinkedList<>(Arrays.asList(strs[Integer.parseInt(split[0]) - 2]));
                fullPermutation(ans, strs[Integer.parseInt(split[1])-2]);
            } else {
                ans = new LinkedList<>(Arrays.asList(strs[Integer.parseInt(split[0]) - 2]));
                fullPermutation(ans, strs[Integer.parseInt(split[1])-2]);
                for (int i = 2; i < split.length; i++) {
                    fullPermutation(ans, strs[Integer.parseInt(split[i])-2]);
                }
            }
            return ans;
        }

        public void fullPermutation(LinkedList<String> ans, String[] arr2){
            int size = ans.size();
            for (int i = 0; i < size; i++) {
                StringBuilder remove = new StringBuilder(ans.remove(0));
                for (int j = 0; j < arr2.length; j++) {
                    ans.addLast(remove.append(arr2[j]).toString());
                    remove.deleteCharAt(remove.length()-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        letter_combinations_of_a_phone_number_17 letter_combinations_of_a_phone_number_17 = new letter_combinations_of_a_phone_number_17();
        letter_combinations_of_a_phone_number_17.new Solution().letterCombinations("234").forEach(System.out::println);
    }
}
