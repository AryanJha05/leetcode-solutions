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

    public void inorder(TreeNode root, ArrayList<Integer> tree) {
        if (root == null)
            return;

        inorder(root.left, tree);

        if (root.left == null && root.right == null)
            tree.add(root.val);

        inorder(root.right, tree);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList<Integer> tree1 = new ArrayList<>();
        ArrayList<Integer> tree2 = new ArrayList<>();

        //Tree 1 :
        inorder(root1, tree1);

        //Tree 2 :
        inorder(root2, tree2);

        return tree1.equals(tree2);
    }
}