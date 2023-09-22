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
    public int minInRightSide(TreeNode root){
        if(root.left == null){
            return root.val;
        }
        return minInRightSide(root.left);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }

        if(key > root.val){
            root.right = deleteNode(root.right,key);
        } else if(key < root.val){
           root.left = deleteNode(root.left,key);
        } else {
            // for 0 child
            if(root.left == null && root.right == null){
                return null;
            }

            // for 1 child
            else if(root.left != null && root.right == null){
                    return root.left;
            }
            else if(root.left == null && root.right != null){
                return root.right;
            }
            else {
                int min = minInRightSide(root.right);
                root.val = min;
                root.right = deleteNode(root.right,min);
            }
        }

        return root;
    }
}
