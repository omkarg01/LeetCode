import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1656 lang=java
 *
 * [1656] Design an Ordered Stream
 */

// @lc code=start
class OrderedStream {

    String[] globalArray;
    int i = 0;

    public OrderedStream(int n) {
        globalArray = new String[n];
    }

    public List insert(int idKey, String value) {
        List outputList = new ArrayList();
        globalArray[idKey - 1] = value;
        while (i < globalArray.length && globalArray[i] != null) {
            outputList.add(globalArray[i]);
            i++;
        }
        return outputList;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
// @lc code=end
