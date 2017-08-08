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
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int left = sumOfLeftLeaves(root.left);
        int sum = left + sumOfLeftLeaves(root.right);
        if(root.left != null && root.left.right == null && root.left.left == null) 
            return sum + root.left.val;
      
        return sum ;
    }
}