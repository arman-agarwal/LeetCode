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
    public int sumNumbers(TreeNode root) {
        return helper(0,root);
    }
    
    private int helper(int number, TreeNode root){
        number = (number*10)+root.val;
        if(root.left==null && root.right==null)
            return number;
        if(root.left==null)
        return helper(number,root.right);
        if(root.right==null)
            return helper(number,root.left);
        return helper(number,root.right)+helper(number,root.left);
    }
}