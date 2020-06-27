import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-06-01-19:03
 */
public class kids_with_the_greatest_number_of_candies_1431 {
    /**
     * question url:https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
     * question context :
     * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
     *
     * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
     */
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            if (candies == null || candies.length == 0){
                return new ArrayList<>();
            }

            List<Boolean> ans = new ArrayList<>();
            if (candies.length == 1){
                ans.add(true);
                return ans;
            }

            int max = candies[0];
            for (int candy : candies) {
                if (candy > max){
                    max = candy;
                }
            }

            for (int candy : candies) {
                if (candy + extraCandies >= max){
                    ans.add(true);
                    continue;
                }

                ans.add(false);
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        kids_with_the_greatest_number_of_candies_1431 kids_with_the_greatest_number_of_candies_1431 = new kids_with_the_greatest_number_of_candies_1431();
        System.out.println(kids_with_the_greatest_number_of_candies_1431.new Solution());;
    }

    public String get(String str){
        if (str == null || str.trim().equals("") || str.length() == 0){
            return null;
        }
        String[] split = str.split(" ");
        HashMap<String , Integer> map = new HashMap();
        for (String s : split) {
            if (map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else {
                map.putIfAbsent(s, 1);
            }
        }

        Integer max = Integer.MIN_VALUE;
        String ans = "";
        for (String s : map.keySet()) {
            if (map.get(s) > max){
                ans = s;
                max = map.get(s);
            }
        }

        return ans;
    }
}
