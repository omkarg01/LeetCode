import java.util.HashMap;

/*
 * @lc app=leetcode id=1365 lang=java
 *
 * [1365] How Many Numbers Are Smaller Than the Current Number
 */

// @lc code=start
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j){
                    if (nums[j] < nums[i]) {
                        count++;
                    }
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
// @lc code=end
