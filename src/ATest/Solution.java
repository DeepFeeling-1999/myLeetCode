package ATest;

import A节点及相关依赖.ListNode;

import java.util.*;

/**
 * @author dell
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int result = 0;
        for (List<Integer> list : triangle) {
            int temp = Integer.MAX_VALUE;
            for (int num : list) {
                if (num < temp) {
                    temp = num;
                }
            }
            result += temp;
        }

        return result;
    }
    public static void main(String[]args){
        List<List<Integer>> test=new ArrayList<>();
        test.add(Arrays.asList(-1));
        test.add(Arrays.asList(2,3));
        test.add(Arrays.asList(1,-1,-3));

        new Solution().minimumTotal(test);
    }
}