package easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author yuhao5
 * @date 2020-07-08
 */
public class diving_board_lcci_mianshi16_11 {
    /**
     * question url:https://leetcode-cn.com/problems/diving-board-lcci/
     * question context :
     * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
     *
     * 返回的长度需要从小到大排列。
     */
    class Solution {
        public int[] divingBoard(int shorter, int longer, int k) {
            if (k == 0){
                return new int[]{};
            }

            if (shorter == longer){
                return new int[]{shorter*k};
            }
            int[] ans = new int[k+1];
            for (int i = 0; i <= k; i++) {
                ans[i] = i*longer + (k-i)*shorter;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        diving_board_lcci_mianshi16_11 diving_board_lcci_mianshi16_11 = new diving_board_lcci_mianshi16_11();
        System.out.println(
                Arrays.toString(diving_board_lcci_mianshi16_11.new Solution().divingBoard(1,2,3))
        );
    }
}
