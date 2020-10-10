//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9315 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> contains = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            contains.put(nums[i],i);
        }


        for (int i = 0; i < nums.length; i++) {

            int temp = target - nums[i];
            /**
             * 注意这里需要判断一下，避免6-3 = 3 这种情况，他要求不能返回同一个index
             */
            if(contains.containsKey(temp) && contains.get(temp)!=i){
                int i1 = contains.get(temp);
                return new int[]{i,i1};
            }
        }

        throw new RuntimeException("no such index");

    }
}
//leetcode submit region end(Prohibit modification and deletion)
