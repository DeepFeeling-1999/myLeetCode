package 二叉树相关.Q104_二叉树最大深度;

import A节点及相关依赖.TreeNode;

/**
 * @author dell
 */
public class Solution {
    public int maxDepth(TreeNode root) {
       if(root==null){
           return 0;
       }else{
           int leftHeight=maxDepth(root.left);
           int rightHeight=maxDepth(root.right);
           return Math.max(leftHeight,rightHeight)+1;
       }
    }
}
