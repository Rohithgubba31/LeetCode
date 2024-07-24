/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        if (root == null) {
            return ls;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // q.add(null);
        boolean ltor = true;
        while (!q.isEmpty()) {
            int s = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < s; i++) {

                TreeNode curr = q.remove();
                // if(curr == null){
                // System.out.println();
                // if(q.isEmpty()){
                // break;
                // }
                // else{
                // q.add(null);
                // }
                // }
                if (ltor) {
                    level.add(curr.val);

                } else {
                    level.add(0, curr.val);
                }

                // System.out.print(curr.val+ " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }

            }

            ls.add(level);
            ltor= !ltor;
                    }
                    return ls;
    }
}