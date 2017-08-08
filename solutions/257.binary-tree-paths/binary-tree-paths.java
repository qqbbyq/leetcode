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
   public void pathHelper(TreeNode node, String prefix, List<String> result){
        if(node.left == null && node.right == null) {result.add(prefix + node.val);return;}
        prefix +=  node.val + "->";
        if(node.left != null) pathHelper(node.left, prefix, result);
        if(node.right != null) pathHelper(node.right, prefix, result);
        return;
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root != null) 
            pathHelper(root, "", result);
        return result;
    }
}