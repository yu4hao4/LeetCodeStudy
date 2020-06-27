package medium;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author 喻浩
 * @create 2020-05-28-9:49
 */
public class decode_string_394 {
    /**
     * question url:https://leetcode-cn.com/problems/decode-string/
     * question context :
     * 给定一个经过编码的字符串，返回它解码后的字符串。
     *
     * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
     *
     * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
     *
     * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
     */
//    class Solution {
//        public String decodeString(String s) {
//            if (s == null || s.length() == 0){
//                return s;
//            }
//            if (!s.contains("]")){
//                return s;
//            }
//
//            char[] chars = s.toCharArray();
//            Stack<String> stack = new Stack();
//            StringBuilder ans = new StringBuilder();
//            for (char aChar : chars) {
//                if (aChar == ']'){
//                    StringBuilder temp = new StringBuilder();
//                    String pop = stack.pop();
//                    while (!pop.equals("[")){
//                        temp.append(pop);
//                        pop = stack.pop();
//                    }
//
//                    StringBuilder numTemp = new StringBuilder("");
//                    String pop1 = stack.pop();
//                    while (pop1.matches("^[0-9]\\d*$") && !stack.isEmpty()){
//                        numTemp.append(pop1);
//                        pop1 = stack.pop();
//                    }
//
//
//                    if (!stack.isEmpty()){
//                        stack.push(pop1);
//                    } else {
//                        numTemp.append(pop1);
//                    }
//
//                    System.out.println(numTemp);
//
//                    int num = Integer.parseInt(numTemp.reverse().toString());
//                    StringBuilder reverse = temp.reverse();
//                    for (int i = 0; i < num; i++) {
//                        if (stack.isEmpty()){
//                            ans.append(reverse);
//                        } else {
//                            stack.push(reverse.toString());
//                        }
//                    }
//
//                    System.out.println(temp.reverse());
////                    System.out.println(Integer.parseInt(String.valueOf(stack.pop())));
//                } else {
//                    stack.push(String.valueOf(aChar));
//                }
//            }
//
//            StringBuilder temp = new StringBuilder();
//            while (!stack.isEmpty()){
//                temp.append(stack.pop());
//            }
//
//            ans.append(temp.reverse());
//
//            return ans.toString();
//        }
//    }

    class Solution {
        private boolean isDigital(char c) {
            return c >= '0' && c <= '9';
        }

        public String decodeString(String s) {
            StringBuilder sb = new StringBuilder();
            LinkedList<Character> linkedList = new LinkedList<>();
            //记录 '[' 的位置
            int[] record = new int[s.length()];
            //'[' 的索引
            int headIndex = -1;
            //记录每个数字
            int[] recordNumber = new int[s.length()];
            //数字的索引
            int numberIndex = -1;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (isDigital(c)) {
                    //记录[]前面的数字
                    int count = c - '0';
                    while (i + 1 < s.length() && isDigital(s.charAt(i + 1))) {
                        count = count * 10 + s.charAt(i + 1) - '0';
                        i++;
                    }
                    numberIndex++;
                    recordNumber[numberIndex] = count;
                } else if (c == '[') {
                    headIndex++;
                    record[headIndex] = linkedList.size();
                } else if (c == ']' && headIndex >= 0) {
                    //保存[]中间的字符
                    char[] temp = new char[linkedList.size() - record[headIndex]];
                    for (int j = temp.length - 1; j >= 0; j--) {
                        temp[j] = linkedList.removeLast();
                    }

                    //再把2[bc]转换为bcbc依次添加到linkedList中
                    for (int j = 0; j < recordNumber[numberIndex]; j++) {
                        //bc
                        for (int k = 0; k < temp.length; k++) {
                            linkedList.add(temp[k]);
                        }
                    }
                    //headIndex 也可以直接用numberIndex
                    headIndex--;
                    numberIndex--;
                } else {
                    linkedList.add(c);
                }
            }
            while (linkedList.size() > 0) {
                sb.append(linkedList.removeFirst());
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        decode_string_394 decode_string_394 = new decode_string_394();
        System.out.println(decode_string_394.new Solution().decodeString("100[leetcode]"));;
//        System.out.println(decode_string_394.new Solution().decodeString("2[abc]3[cd]ef"));;
//        System.out.println(decode_string_394.new Solution().decodeString("3[a2[c]]"));;
//        System.out.println(decode_string_394.new Solution().decodeString("3[a]2[bc]"));;
    }
}
