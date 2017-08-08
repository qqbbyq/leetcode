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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack <TreeNode> stack = new Stack<>();
       TreeNode p;
        stack.push(root);
       while(!stack.empty()){
           p = stack.pop();
           list.add(p.val);
           if(p.right != null) stack.push(p.right);
           if(p.left != null) stack.push(p.left);
       }
        return list;
        
    }
}