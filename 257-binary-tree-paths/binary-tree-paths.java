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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        String s = "";
        helper( root, res , "");
        return res;
    }

    public static void helper(TreeNode root, List<String> res, String s){
        if(root == null){
            return;
        }
        if(root.left==null && root.right==null){ //its a leaf node
            s += root.val;
            res.add(s);
            s="";
            return;
        }else{
        s+=root.val +"->";
        helper(root.left, res, s);
        helper(root.right, res, s);
        }
    }
}