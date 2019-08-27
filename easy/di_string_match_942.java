package easy;

import java.util.ArrayList;

/**
 * @author 喻浩
 * @create 2019-08-27-14:24
 */
public class di_string_match_942 {
    /**
     * question url:https://leetcode-cn.com/problems/di-string-match/
     * question context :
     * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
     *
     * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
     *
     * 如果 S[i] == "I"，那么 A[i] < A[i+1]
     * 如果 S[i] == "D"，那么 A[i] > A[i+1]
     * 
     * 思路：
     * 这道题一开始没想明白，最后想到的是，提取所有的规则，然后，得出一个结果。
     * 后面去看了答案，其实很简单，
     * 当为 I 时，拿到最小的
     * 当为 D 时，拿到最大的
     * 依次赋值给新建的数组
     */
    class Solution {
        public int[] diStringMatch(String S) {
            int left = 0;
            int right = S.length();
            char[] chars = S.toCharArray();
            int[] result = new int[right+1];
            int location = 0;

            for(int i = 0;i < S.length();i++){
                if(chars[i] == 'I'){
                    result[location] = left++;
                }
                
                if(chars[i] == 'D'){
                    result[location] = right--;
                }
                location++;
            }
            result[location] = left;
            return result;
        }
    }
    
    public static void main(String[] args) {
        di_string_match_942 di_string_match_942 = new di_string_match_942();
        System.out.println(di_string_match_942.new Solution().diStringMatch("IDID"));;
    }
}
