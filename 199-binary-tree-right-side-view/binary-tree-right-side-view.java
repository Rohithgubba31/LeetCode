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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls   = new ArrayList<>();
        int level = 0;
        righthelp(root, 0, ls);
        return ls;
    }

    public static void righthelp(TreeNode root,int level, List<Integer> ls){    
        if(root==null){
            return;
        }
        if(ls.size() == level){
        ls.add(root.val);
        }
        righthelp(root.right,level+1,ls);
        righthelp(root.left,level+1,ls);
    
    }
}