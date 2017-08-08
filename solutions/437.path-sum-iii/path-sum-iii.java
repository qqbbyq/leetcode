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
    int count = 0;
    
    public int sumFrom(TreeNode node, int sum
    ){
       
        if(node == null) return 0;
        int count = node.val == sum? 1:0;
        int left = sumFrom(node.left, sum - node.val);
        int right = sumFrom(node.right, sum - node.val);
        return left + right + count;
    }
    
    public int pathSum(TreeNode root, int sum) {
        
        if(root == null) return 0;
        return sumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
}