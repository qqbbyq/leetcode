/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    boolean isBalanced = true;
    
    public int depth(TreeNode root){
        
        if(root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        if(Math.abs(left - right) >1 && isBalanced) isBalanced = false;
        return Math.max(left, right) + 1;
    }
    
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return isBalanced;
    }
}