package easy;

import java.util.Arrays;

/**
 * @author 喻浩
 * @create 2020-03-27-12:16
 */
public class x_of_a_kind_in_a_deck_of_cards_914 {
    /**
     * question url:https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/
     * question context :
     * 给定一副牌，每张牌上都写着一个整数。
     *
     * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
     *
     * 每组都有 X 张牌。
     * 组内所有的牌上都写着相同的整数。
     * 仅当你可选的 X >= 2 时返回 true。
     */
    class Solution {
//        public boolean hasGroupsSizeX(int[] deck) {
//            if (deck == null || deck.length < 2){
//                return false;
//            }
//
//            if (deck.length == 2){
//                return true;
//            }
//
//            Arrays.sort(deck);
//
//            int num = 1;
//            int number = deck[0];
//            for (int i = 1; i < deck.length; i++) {
//                if (deck[i] == number){
//                    num++;
//                }else {
//                    break;
//                }
//            }
//
//            if (deck.length % num != 0){
//                return false;
//            }
//
//            int tempNum = 1;
//            number = deck[num];
//            for (int i = num+1; i < deck.length; i++) {
//                if (tempNum == num){
//                    number = deck[i];
//                    tempNum = 1;
//                } else if (deck[i] == number){
//                    tempNum++;
//                } else {
//                    return false;
//                }
//            }
//
//            return true;
//        }

        public boolean hasGroupsSizeX(int[] deck) {
            int[] count = new int[10000];
            for (int c: deck)
                count[c]++;

            int g = -1;
            for (int i = 0; i < 10000; ++i)
                if (count[i] > 0) {
                    if (g == -1)
                        g = count[i];
                    else
                        g = gcd(g, count[i]);
                }

            return g >= 2;
        }

        public int gcd(int x, int y) {
            return x == 0 ? y : gcd(y%x, x);
        }
    }

    public static void main(String[] args) {
//        int[] nums = {1,1,2,2,2,2};
//        int[] nums = {1,1};
//        int[] nums = {1,1,1,2,2,2,3,3};
        int[] nums = {1,2,3,4,4,3,2,1};
        x_of_a_kind_in_a_deck_of_cards_914 x_of_a_kind_in_a_deck_of_cards_914 = new x_of_a_kind_in_a_deck_of_cards_914();
        System.out.println(x_of_a_kind_in_a_deck_of_cards_914.new Solution().hasGroupsSizeX(nums));;
    }
}
