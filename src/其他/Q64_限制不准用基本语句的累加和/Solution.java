package 其他.Q64_限制不准用基本语句的累加和;

public class Solution {
    public int sumNums(int n) {
        boolean test = ((n > 0) && (n += sumNums(n - 1)) > 0);
        return n;
    }
    public static void main(String[]args) {
        int[] ar = new int[]{1, 2, 3, 4, 5};

        System.out.println((new Solution()).sumNums(10));
    }

}
