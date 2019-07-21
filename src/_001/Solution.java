package _001;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zengjinlin
 * @create 2019-07-21 21:15
 */
public class Solution {

    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 利用 HashMap 作为存储，键为目标值减去当前元素值，索引为值，
     * 比如 i = 0 时，此时首先要判断 nums[0] = 2 是否在 map 中，
     * 如果不存在，那么插入键值对 key = 9 - 2 = 7, value = 0，之后当 i = 1 时，
     * 此时判断 nums[1] = 7 已存在于 map 中，那么取出该 value = 0 作为第一个返回值，
     * 当前 i 作为第二个返回值
     * @param nums
     * @param target
     * @return
     */
    private int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            final Integer value = map.get(nums[i]);
            if (value != null) {
                return new int[]{value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 22;
        System.out.println(Arrays.toString(solution.twoSum2(nums, target)));
    }
}
