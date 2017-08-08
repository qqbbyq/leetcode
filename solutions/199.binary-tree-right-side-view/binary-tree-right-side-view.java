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
    public void rightHelper(TreeNode node, int count, List<Integer> result){
        if(node == null) return ;
        if(result.size() == count){
            result.add(node.val);
        }
        count ++;
        rightHelper(node.right, count, result);
        rightHelper(node.left, count, result );
        return;
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        rightHelper(root, 0, result);
        return result;
        
    }
}