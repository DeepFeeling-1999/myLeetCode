package 二叉树相关.Q101_对称二叉树;

import A节点及相关依赖.TreeNode;

/**
 * @author dell
 */
public class Solution {
    public boolean helper(TreeNode t1, TreeNode t2) {
        //都为null时
        if (t1 == null && t2 == null) {
            return true;
        }
        //只有一个null时
        if (t1 == null || t2 == null) {
            return false;
        }

        //递归调用子树
        return t1.val == t2.val && helper(t1.left, t2.right) && helper(t1.right, t2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }
}
