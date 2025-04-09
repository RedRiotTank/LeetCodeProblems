package org.twosum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++){
        int searchNum = target - nums[i];

        if (map.containsKey(searchNum)) return new int[] {map.get(searchNum), i};
        else map.put(nums[i], i);

    }
        return new int[] {};
    }
}

