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
    public TreeNode buildHelper(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd){
        
        TreeNode node = new TreeNode(postorder[postEnd]);
        if(inStart == inEnd && postStart == postEnd) return node;
        int i;
        for(i= inStart ; i<= inEnd; ++i){
            if(inorder[i] == postorder[postEnd])
                break;
        }
        int leftLength = i-inStart;
        int rightLength = inEnd - i;
        if(rightLength>0)
            node.right = buildHelper(inorder, postorder, i+1, inEnd, postEnd - rightLength, postEnd-1);
        if(leftLength >0)
            node.left = buildHelper(inorder, postorder, inStart, i-1, postStart, postEnd - rightLength - 1);
        return node;
        
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if(inorder.length == 0 || postorder.length ==0 ) return null;
        return buildHelper(inorder, postorder, 0, inorder.length - 1, 0, inorder.length-1);
    }
}