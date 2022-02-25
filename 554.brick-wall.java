import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=554 lang=java
 *
 * [554] Brick Wall
 */

// @lc code=start
class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;
        for (List<Integer> level : wall) {
            int ps = 0;
            for (int i = 0; i < level.size() - 1; i++) {
                int val = level.get(i);
                ps += val;
                map.put(ps, map.getOrDefault(ps, 0) + 1);
                max = Math.max(max, map.get(ps));
            }
            // ps = 0;
        }
        return wall.size() - max;
    }
}
// @lc code=end
