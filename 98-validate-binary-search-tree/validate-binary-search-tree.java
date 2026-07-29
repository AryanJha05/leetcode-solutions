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
    List<Integer> arr = new ArrayList<>();

    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }

    public boolean isSorted(List<Integer> arr){
        for(int i = 1; i < arr.size(); i++) if(arr.get(i-1) >= arr.get(i)) return false;
        
        return true;
    }
    public boolean isValidBST(TreeNode root) {

        inorder(root);

        return isSorted(arr);
    }
}