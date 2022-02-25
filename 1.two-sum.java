/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        // iterate throught the array, if i and i+1 = target, return the indices
        for (int i = 0; i < length - 1; i++) {
            // pick a number to start comparing
            int firstNumber = nums[i];
            for (int j = i + 1; j < length; j++) {
                // pick a second number to compare
                int secondNumber = nums[j];
                // compare them
                if (firstNumber + secondNumber == target) {
                    int[] result = new int[] { i, j };
                    return result;
                }
            }
        }
        return null;
    }
}
// @lc code=end
