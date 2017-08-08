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
    
    public int sumHelper(TreeNode node, int lastNum){
        if(node == null) return 0;
        int currNum = lastNum * 10 + node.val;
        if(node.left == null && node.right == null){
            return currNum;
        }
        int left = sumHelper(node.left, currNum);
        int right = sumHelper(node.right, currNum);
        return right + left ;
    }
    
    public int sumNumbers(TreeNode root) {
        return sumHelper(root, 0);
        
    }
}