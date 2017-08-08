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
    public void orderBottomHelper(TreeNode node, List<List<Integer>> result, int count){
        if(node == null) return ;
        if(result.size() == count){
            result.add(0, new LinkedList<Integer>());
        }
        orderBottomHelper(node.left, result, count +1);
        orderBottomHelper(node.right, result, count + 1);
        result.get(result.size() - count -1 ).add(node.val);
        return;
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        orderBottomHelper(root, result, 0);
        return result;
        
    }
}