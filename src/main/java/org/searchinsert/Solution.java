package org.searchinsert;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int[] newNums;
        int middleIndex = nums.length / 2;

        if(nums[middleIndex] == target) return middleIndex;

        if(middleIndex == 1){
            if (target > nums[middleIndex]){
                if (target > nums[nums.length - 1]) return nums.length;
                else if (target < nums[middleIndex - 1]) return middleIndex - 1;
                else return middleIndex + 1;
            }
           else if(target < nums[middleIndex]){
                if (target <= nums[0]) return 0;
                else return middleIndex;
           }
        }

        if (middleIndex == 0) {
            if (target < nums[0]) return 0;
            else return 1;
        }

        if(nums[middleIndex] < target){
            newNums = new int[nums.length - middleIndex - 1];

            for (int i = middleIndex + 1; i < nums.length; i++) newNums[i - middleIndex - 1] = nums[i];

            return searchInsert(newNums, target) + middleIndex + 1;
        }

        if(nums[middleIndex] > target){
            newNums = new int[middleIndex];

            for (int i = 0; i < middleIndex; i++) newNums[i] = nums[i];

            return searchInsert(newNums, target);
        }

        return 0;
    }
}
