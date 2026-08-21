/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void backtrack(TreeNode root, int target, List<Integer> curr, List<List<Integer>> res){

        if(root == null) return;

        curr.add(root.val);

        if(root.left == null && root.right == null){
            if(target == root.val) res.add(new ArrayList<>(curr));

            curr.remove(curr.size() - 1);
            return;
        }
        
        backtrack(root.left, target - root.val, curr, res);
        backtrack(root.right, target - root.val, curr, res);

        curr.remove(curr.size() - 1);

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> res = new ArrayList<>();

        backtrack(root, targetSum, new ArrayList<>(), res);

        return res;
    }
}