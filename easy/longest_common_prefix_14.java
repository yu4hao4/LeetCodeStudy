package easy;

/**
 * @author 喻浩
 * @create 2019-11-07-20:04
 */
public class longest_common_prefix_14 {
    /**
     * question url:https://leetcode-cn.com/problems/longest-common-prefix/
     * question context :
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     *
     * 如果不存在公共前缀，返回空字符串 ""。
     */
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0){
                return "";
            }

            String result = strs[0];
            
            for(int i = 1; i < strs.length;i++){
                int j = 0;
                for (;j<result.length() && j < strs[i].length(); j++) {
                    if (result.charAt(j) != strs[i].charAt(j)){
                        break;
                    }
                }
                
                result = result.substring(0,j);
            }
            
            return "";
        }
    }
    
    public static void main(String[] args) {
        String [] test = { "flower","flow","flight"};
//        String [] test = {"dog","racecar","car"};
//        longest_common_prefix_14 longest_common_prefix_14 = new longest_common_prefix_14();
//        System.out.println(
//                longest_common_prefix_14
//                        .new Solution()
//                        .longestCommonPrefix(test)
//        );

        System.out.println("".length());
    }
}
