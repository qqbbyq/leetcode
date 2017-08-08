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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode prev = null;
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        while(p != null){
            for(;p.left != null; p= p.left) stack.push(p);
            while(p.right == null || prev == p.right){
                list.add(p.val);
                prev = p;
                if(stack.empty()) return list;
                p = stack.pop();
            }
            stack.push(p);
            p = p.right;
        }
        return list;
    }
}