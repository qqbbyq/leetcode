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
    
   // List<List<Integer>> result = new ArrayList<>();
    
    // public void sum(TreeNode node, int sum, List<Integer> font){
    //     if(node == null) return;
    //     List<Integer> newFont = new ArrayList<Integer>();
    //     newFont.addAll(font);
    //     newFont.add(node.val);
    //     if(node.val == sum && node.left == null && node.right == null){
    //         result.add(newFont);
    //         return ;
    //     }
    //     int toSum = sum - node.val;
    //     sum(node.left, toSum, newFont);
    //     sum(node.right, toSum, newFont);
    //     return;
    // }
    
    public void sum(TreeNode node, int sum, Stack<Integer> stack, List<List<Integer>> result){
        if(node == null) return;
        stack.push(node.val);
        if(node.val == sum && node.right == null && node.left == null){
            result.add(new ArrayList(stack));
        }
        int toSum = sum - node.val;
        sum(node.left, toSum, stack, result);
        sum(node.right, toSum, stack, result);
        stack.pop();
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Stack<Integer> stack = new Stack<>(); 
        sum(root, sum, stack, result );
        return result;
    }
};