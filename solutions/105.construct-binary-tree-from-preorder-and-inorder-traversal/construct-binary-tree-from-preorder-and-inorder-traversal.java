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
    public TreeNode buildHelper(int[] preorder, int [] inorder, int preStart, int preEnd, int inStart, int inEnd){
        TreeNode node = new TreeNode(preorder[preStart]);
        if(preStart == preEnd && inStart == inEnd) return node;
       
        int i;
        for(i = inStart; i<= inEnd; ++i){
            if(inorder[i] == preorder[preStart]){
                break;
            }
        }
        int leftLength = i - inStart;
        int rightLength = inEnd - i;
        if(leftLength >0)
            node.left = buildHelper(preorder, inorder, preStart + 1, preStart + leftLength, inStart, i-1);
        else node.left = null;
        
        if(rightLength >0)
            node.right = buildHelper(preorder, inorder, preEnd - rightLength + 1,  preEnd, i+ 1, inEnd);
        else node.right = null;
        return node;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0) return null;
    
        return buildHelper(preorder, inorder, 0, preorder.length - 1, 0, preorder.length -1);
    }
}