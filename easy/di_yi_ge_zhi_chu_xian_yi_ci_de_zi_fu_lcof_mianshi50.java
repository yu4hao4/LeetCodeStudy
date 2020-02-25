package easy;

import java.util.*;

/**
 * @author 喻浩
 * @create 2020-02-24-17:32
 */
public class di_yi_ge_zhi_chu_xian_yi_ci_de_zi_fu_lcof_mianshi50 {
    /**
     * question url:https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
     * question context :
     * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
     */
    class Solution {
        public char firstUniqChar(String s) {
            if (s.equalsIgnoreCase("")){
                return ' ';
            }
            char[] chars = s.toCharArray();
            TreeMap<Character,Integer> map = new TreeMap();
            HashMap<Integer,Character> hashMap = new HashMap<>();
            int index = 0;
            for (int i = 0; i < chars.length; i++) {
                if(map.get(chars[i]) == null){
                    hashMap.put(index,chars[i]);
                    map.put(chars[i], index++);
                }else {
                    hashMap.remove(map.get(chars[i]));
                }
            }

            if (hashMap.size() == 0){
                return ' ';
            }
            
            Object[] objects = hashMap.keySet().toArray();
            Arrays.sort(objects);
            return hashMap.get(objects[0]);
        }
        
    }
    
    public static void main(String[] args) {
        di_yi_ge_zhi_chu_xian_yi_ci_de_zi_fu_lcof_mianshi50 di_yi_ge_zhi_chu_xian_yi_ci_de_zi_fu_lcof_mianshi50 = new di_yi_ge_zhi_chu_xian_yi_ci_de_zi_fu_lcof_mianshi50();
//        System.out.println(di_yi_ge_zhi_chu_xian_yi_ci_de_zi_fu_lcof_mianshi50.new Solution().firstUniqChar("abaccdeff"));;
//        System.out.println(di_yi_ge_zhi_chu_xian_yi_ci_de_zi_fu_lcof_mianshi50.new Solution().firstUniqChar("leetcode"));;
        System.out.println(di_yi_ge_zhi_chu_xian_yi_ci_de_zi_fu_lcof_mianshi50.new Solution().firstUniqChar("aabb"));;
    }
}
