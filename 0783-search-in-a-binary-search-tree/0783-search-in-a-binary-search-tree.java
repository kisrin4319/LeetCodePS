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
    public TreeNode searchBST(TreeNode root, int val) {

        TreeNode key = root;

        while(key != null) {

            if (key.val == val) {
                return key;
            } else if (key.val < val) {
                key = key.right;
            } else {
                key = key.left;
            }
        }

        return null;
    }
}