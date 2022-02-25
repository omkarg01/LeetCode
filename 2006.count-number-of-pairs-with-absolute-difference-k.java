/*
 * @lc app=leetcode id=2006 lang=java
 *
 * [2006] Count Number of Pairs With Absolute Difference K
 */

// @lc code=start
class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // if (i != j) {
                    int diff = Math.abs(nums[i] - nums[j]);
                    if (diff == k) {
                        count++;
                    }
                // }
            }
        }
        return count;
    }
}
// @lc code=end

