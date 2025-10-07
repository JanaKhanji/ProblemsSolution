// https://leetcode.com/problems/invert-binary-tree/description/
import java.util.*;

class InvertBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        static TreeNode createTree(int[] list){
            if (list == null || list.length == 0) {
                return null;
            }
    
            TreeNode root = new TreeNode(list[0]);
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
    
            int i = 1;
            while (!queue.isEmpty() && i < list.length) {
                TreeNode current = queue.poll();
                if (i < list.length) {
                    current.left = new TreeNode(list[i++]);
                    queue.add(current.left);
                }
    
                if (i < list.length) {
                    current.right = new TreeNode(list[i++]);
                    queue.add(current.right);
                }
            }
    
            return root;
        }

        static void logTreeNode(TreeNode root) {
            if (root == null) return;
            Queue<TreeNode> queue = new LinkedList<>();
            StringBuilder str = new StringBuilder();
            queue.add(root);
    
            while (!queue.isEmpty()) {
                TreeNode el = queue.poll();
                if (el != null) {
                    str.append(el.val);
                    str.append(", ");
                    if (el.right != null || el.left != null) {
                        queue.add(el.left);
                        queue.add(el.right);
                    }
                }               
            }
            System.out.println(str);
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode el = queue.poll();
            if (el.left != null || el.right!= null) {
                if (el.right == null) {
                    el.right = el.left;
                    el.left = null;
                    queue.add(el.right);
                } else if (el.left == null) {
                    el.left = el.right;
                    el.right = null;
                    queue.add(el.left);
                } else {
                    TreeNode temp = el.right;
                    el.right = el.left;
                    el.left = temp;
                    queue.add(el.left);
                    queue.add(el.right);
                }
            }
        }
        return root; 

    }

    public static void main(String[] args) {
        TreeNode.logTreeNode(invertTree(TreeNode.createTree(new int[]{4,2,7,1,3,6,9})));
    }
}