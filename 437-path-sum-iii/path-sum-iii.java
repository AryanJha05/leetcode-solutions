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

    public int cntPath(TreeNode root, long target){

        if(root == null) return 0;

        int cnt = 0;

        if(root.val == target) cnt++;

        cnt += cntPath(root.left, target - root.val);
        cnt += cntPath(root.right, target - root.val);

        return cnt;
    }

    public int pathSum(TreeNode root, int targetSum) {

        if(root == null) return 0;
        
        int cnt = cntPath(root, targetSum);

        cnt += pathSum(root.left, targetSum);
        cnt += pathSum(root.right, targetSum);

        return cnt;
    }
}