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
    public int goodNodes(TreeNode root) {
        int rootVal = root.val;
        return  countGoodNode(root.left,rootVal)+countGoodNode(root.right,rootVal)+1;
    }

    private int countGoodNode(TreeNode node, int maxValue) {
        if (node == null) {
           return 0;
        }
        if (node.left == null && node.right == null) {
            if (node.val >= maxValue) {
                return 1;
            } else {
                return 0;
            }
        }
        int count = 0;
        if (maxValue <= node.val) {
            count++;
            maxValue = node.val;
        }
        return countGoodNode(node.left, maxValue)+countGoodNode(node.right, maxValue) +count;

    }
}