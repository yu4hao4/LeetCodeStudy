import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 喻浩
 * @create 2020-04-25-11:08
 */
public class permutations_46 {
    /**
     * question url:
     * question context :
     */
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            process(ans,nums, new HashSet(),new ArrayList<>());
            return ans;
        }

        public void process(List ans,int[] nums, Set set,List list){
            if (set.size() == nums.length){
                ans.add(new ArrayList<>(list));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])){
                    continue;
                }

                list.add(nums[i]);
                set.add(nums[i]);
                process(ans, nums, set, list);
                list.remove(list.size()-1);
                set.remove(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permutations_46 permutations_46 = new permutations_46();
        permutations_46.new Solution().permute(nums).forEach(System.out::println);
    }
}
