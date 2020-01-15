package org.sementsov.leetcode.twosum;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int nums[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

}

class Solution {
    public int[] twoSum(final int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>() {{put(nums[0], 0);}};

        for (int i = 1; i < nums.length; map.put(nums[i], i++)) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
        }

        return null;
    }
}


