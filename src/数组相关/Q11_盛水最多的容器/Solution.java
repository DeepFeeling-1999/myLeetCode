package 数组相关.Q11_盛水最多的容器;

/**
 * @author dell
 */
public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, ans = 0, temp = 0;
        while (left < right) {
            //记录临时盛水量，即取左右边界较小值×边界距离既是盛水量
            temp = Math.min(height[left], height[right]) * (right - left);
            ans = Math.max(temp, ans);
            //双指针调用，来不断往中间靠，从而求出最大值
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
