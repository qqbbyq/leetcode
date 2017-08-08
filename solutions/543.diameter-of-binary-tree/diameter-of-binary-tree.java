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
    
    int max = 0;
    
    public int maxLength(TreeNode root){
        if(root == null ) return 0;
        int right = maxLength(root.right);
        int left = maxLength(root.left);
        max = Math.max(right + left, max);
        
        return Math.max(right, left) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxLength(root);
        return max;
    }
}