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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        // return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    
        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();
        
        pStack.push(p);
        qStack.push(q);
        while(!pStack.empty() && !qStack.empty()){
            TreeNode pNode = pStack.pop();
            TreeNode qNode = qStack.pop();
            if(pNode.val != qNode.val) return false;
            if(pNode.right != null && qNode.right != null){
                pStack.push(pNode.right);
                qStack.push(qNode.right);
            } else if(!(pNode.right == null && qNode.right == null)){
                return false;
            }
             if(pNode.left != null && qNode.left != null){
                pStack.push(pNode.left);
                qStack.push(qNode.left);
            } else if(!(pNode.left == null && qNode.left == null)){
                return false;
            }
        }
        return true;
        
    }
}