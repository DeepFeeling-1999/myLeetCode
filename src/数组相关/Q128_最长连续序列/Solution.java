package 数组相关.Q128_最长连续序列;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dell
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        //填入集合中，去重
        HashSet<Integer> mySet = new HashSet<>();
        for (int i : nums) {
            mySet.add(i);
        }
        int ans = 0;
        for (int i : mySet) {
            //当前一个数字不在集合中时，跳过，以此进行优化
            if (!(mySet.contains(i - 1))) {
                int currentAns = 1;
                //遍历后续连续序列
                while (mySet.contains(i + 1)) {
                    i++;
                    currentAns++;
                }
                ans = Math.max(ans, currentAns);
            }

        }
        return ans;
    }
}
