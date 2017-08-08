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
    public boolean isValidHelper(TreeNode node, long minVal, long maxVal ){
        if(node == null) return true;
        if(node.val >= maxVal || node.val <= minVal) return false;
        return isValidHelper(node.left,  minVal, node.val) && isValidHelper(node.right, node.val, maxVal);
    }
    
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return isValidHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
}