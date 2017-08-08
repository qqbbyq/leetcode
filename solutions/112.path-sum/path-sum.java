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
    // boolean hasSum = false;
    
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        else if(root.val == sum &&  root.left == null && root.right == null) return true;
        int toSum = sum - root.val;
        return hasPathSum(root.left, toSum)|| hasPathSum(root.right, toSum);
    }
}