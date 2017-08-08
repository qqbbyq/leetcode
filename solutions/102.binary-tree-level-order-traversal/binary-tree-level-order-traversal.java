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
//     public void levelForeach(TreeNode node, List<List<Integer>> result, int count){
//         if(node == null) return;
//         if(result.size() <=  count) result.add(count, new ArrayList<Integer>());
//         result.get(count++).add(node.val);
//         levelForeach(node.left, result, count);
//         levelForeach(node.right, result, count);
//         return;
//   }
    
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> result = new ArrayList<>();
//         levelForeach(root, result, 0);
//         return result;
//     }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode p;
        while(queue.peek()!= null){
            List<Integer> subList = new ArrayList<>();
            int num = queue.size();
            for(; num > 0; num --){
                p = queue.poll();
                if(p.left != null) queue.offer(p.left);
                if(p.right != null) queue.offer(p.right);
                subList.add(p.val);
            }
            result.add(subList);
           
        }
        return result;
    }
}