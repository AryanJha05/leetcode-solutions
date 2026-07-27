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

    // public static Node tree_to_list(Node root){

    // }

    public static void dfs(TreeNode root){

        if(root == null) return;

        dfs(root.left);
        dfs(root.right);

        //Main Logic to shift left to right :

        TreeNode left = root.left;
        TreeNode right = root.right;


        root.left = null;
        root.right = left;

        TreeNode curr = root;

        while(curr.right != null) curr = curr.right;

        curr.right = right;

    }
    
    public void flatten(TreeNode root) {

        dfs(root);
    }
}