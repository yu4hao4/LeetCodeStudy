package easy;

/**
 * @author 喻浩
 * @create 2019-08-19-16:38
 */
public class jewels_and_stones_771 {
    /**
     * question url:https://leetcode-cn.com/problems/jewels-and-stones/
     * question context :
     * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，
     * 你想知道你拥有的石头中有多少是宝石。
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     */
    class Solution {
        public int numJewelsInStones(String J, String S) {
            char[] jChars = J.toCharArray();
            char[] sChars = S.toCharArray();
            int result = 0;
            for(int i = 0;i < sChars.length;i++){
                for(int j = 0;j < jChars.length;j++){
                    if(sChars[i] == jChars[j]){
                        result++;
                    }
                }
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
        jewels_and_stones_771 jewels_and_stones_771 = new jewels_and_stones_771();
        System.out.println(jewels_and_stones_771.new Solution().numJewelsInStones("aA", "aAAbbbb"));;
    }
}
