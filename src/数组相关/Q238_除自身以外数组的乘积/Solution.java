package 数组相关.Q238_除自身以外数组的乘积;

/**
 * @author dell
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        ans[0]=1;

        //先乘左边
        for(int i=1;i<n;i++){
            ans[i]=nums[i-1]*ans[i-1];
        }

        //用r来记录右边的乘积，逆序得出所有结果
        for(int i=n-1,r=1;i>=0;i--){
            ans[i]=ans[i]*r;
            r=r*nums[i];
        }
        return ans;
    }
    public static void main(String[]args){
        int []ar=new int[]{1,2,3,4,5};

        (new Solution()).productExceptSelf(ar);
    }
}
