/**
 * @author 喻浩
 * @create 2020-05-06-11:20
 */
public class excel_sheet_column_number_171 {
    /**
     * question url:https://leetcode-cn.com/problems/excel-sheet-column-number/
     * question context :
     * 给定一个Excel表格中的列名称，返回其相应的列序号。
     */
    class Solution {
        public int titleToNumber(String s) {
            char[] chars = s.toCharArray();
            int res = 0;
            for (char aChar : chars) {
                res = res * 26 + (aChar-'A' + 1);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        excel_sheet_column_number_171 excel_sheet_column_number_171 = new excel_sheet_column_number_171();
        System.out.println(excel_sheet_column_number_171.new Solution());;
    }
}
