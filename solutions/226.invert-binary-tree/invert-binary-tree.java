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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(queue.peek() != null){
            TreeNode p = queue.poll();
            TreeNode l = p.left;
            p.left = p.right;
            p.right = l;
            
            
            if(p.left != null) queue.offer(p.left);
            if(p.right != null) queue.offer(p.right);
        }
        
        return root;
    }
}